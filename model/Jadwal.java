package model;

import java.util.*;
import com.bethecoder.ascii_table.*;
public class Jadwal {
  
  private String nama;
  private Map<String, Dosen> dosen; // namaDosen : dosen
  private Map<String, Fasilitas> fasilitas;  // namaFasilitas : fasilitas
  private Map<String, Matakuliah> matakuliah; // namaMatakuliah : matakuliah
  private Map<String, Ruangan> ruangan; // namaRuangan : ruangan
  public List<List<Map<String, JadwalAssignment>>> jadwalAssignment; // [hari][jam][namaRuangan : jadwal]

  public Jadwal(String nama) {
    this.nama = nama;
    dosen = new HashMap<>();
    fasilitas = new HashMap<>();
    matakuliah = new HashMap<>();
    ruangan = new HashMap<>();

    jadwalAssignment = new ArrayList<>(5);
    for (int i=0; i<5; i++) {
      List<Map<String, JadwalAssignment>> jam = new ArrayList<>(11);
      for (int j=0; j<11; j++) {
        Map<String, JadwalAssignment> jadwal = new HashMap<>();
        jam.add(jadwal);
      }
      jadwalAssignment.add(jam);
    }
  }

  // Assignment
  public void assignTo(
    String namaMatakuliah,
    String namaRuangan,
    String namaDosen,
    int hari,
    int jam,
    int durasi) {

    Set<String> errors = getError(namaMatakuliah, namaRuangan, namaDosen, hari, jam, durasi);
    if (errors.size() == 0) {
      Matakuliah matakuliah = this.matakuliah.get(namaMatakuliah);
      Dosen dosen = this.dosen.get(namaDosen);
      Ruangan ruangan = this.ruangan.get(namaRuangan);
      for (int d=0; d<durasi; d++) {
        Map<String, JadwalAssignment> jadwal = jadwalAssignment.get(hari-1).get(jam-1+d);
        if (jadwal.get(namaRuangan) == null) {
          JadwalAssignment jadwalBaru = new JadwalAssignment(matakuliah, ruangan, dosen);
          jadwal.put(namaRuangan, jadwalBaru);
        } else {
          jadwal.get(namaRuangan).setJadwal(matakuliah, dosen, ruangan);
          jadwal.get(namaRuangan).setIsSet(true);
        }
        matakuliah.setAllocated(matakuliah.getAllocated()+1);
      }
      printPrompt("success", "Penjadwalan matakuliah " + namaMatakuliah + "pada ruang " + namaRuangan + " berhasil!");
    } else {
      // got some errors
      System.out.println(errors);
    }
  }

  public void unassignFrom(String namaRuangan, int hari, int jam, int durasi) {
    for (int d=0; d<durasi; d++) {
      jadwalAssignment.get(hari-1).get(jam-1+d).remove(namaRuangan);
    }
  }

  private Set<String> getError(
    String namaMatakuliah,
    String namaRuangan,
    String namaDosen,
    int hari,
    int jam,
    int durasi) {
      Set<String> error = new HashSet<>();
      Map<String, JadwalAssignment> jadwal = jadwalAssignment.get(hari-1).get(jam-1);

      // cek valid waktu
      if (hari > 5 && jam > 11) {
        error.add("invalidTime");
      }
      // cek namaMatakuliah
      if (!matakuliah.containsKey(namaMatakuliah)) {
        error.add("namaMatakuliah");
      }
      // cek namaRuangan
      if (!ruangan.containsKey(namaRuangan)) {
        error.add("namaRuangan");
      }
      // cek namaDosen
      if (!dosen.containsKey(namaDosen)) {
        error.add("namaDosen");
      }
      // cek allocable hour matakuliah terkait
      if (matakuliah.get(namaMatakuliah).allocableHours() < durasi) {
        error.add("allocated");
      }
      // cek apakah tersedia jadwal sebanyak durasi
      boolean isAvailable = true;
      if (12-jam >= durasi) {
        for (int d=0; d<durasi; d++) {
          Map<String, JadwalAssignment> currJadwal = jadwalAssignment.get(hari-1).get(jam-1+d);
          if (currJadwal.get(namaRuangan) != null) {
            if (currJadwal.get(namaRuangan).getIsSet()) {
              isAvailable = false;
              break;
            }
          }    
        }
      } else {
        isAvailable = false;
      }
      if (!isAvailable) {
        error.add("availability");
      }

      // cek kapasitas
      if (ruangan.get(namaRuangan).getKapasitas() < matakuliah.get(namaMatakuliah).getKapasitas()) {
        error.add("capacity");
      }
      // cek fasilitas
      if (!ruangan.get(namaRuangan).getFasilitas().containsAll(matakuliah.get(namaMatakuliah).getFasilitas())) {
        error.add("facility");
      }
      // cek dosen bentrok jadwal
      boolean foundDosen = false;
      for (JadwalAssignment j : jadwal.values()) {
        if (j.getDosen().getNama() == namaDosen) {
          foundDosen = true;
          break;
        }
      }
      if (foundDosen) {
        error.add("dosen");
      }
      // cek matkul dg tingkat yg sama
      boolean foundTingkat = false;
      for (JadwalAssignment j : jadwal.values()) {
        if (j.getMatakuliah().getTingkat() == matakuliah.get(namaMatakuliah).getTingkat()) {
          foundTingkat = true;
          break;
        }
      }
      if (foundTingkat) {
        error.add("tingkat");
      }

      return error;
  }

  public void printPrompt(String mode, String msg) {
    if (mode == "error") {
      System.out.println("[ERROR] " + msg);
    } else {
      System.out.println("[SUCCESS] " + msg);
    }
  }

  // show methods
  private void printTable(ASCIITableHeader[] headerTable, List<List<String>> printData) {
    // convert list to array
    String[][] printDataAsArray = new String[printData.size()][];
    for (int i = 0; i < printData.size(); i++) {
      List<String> row = printData.get(i);
      printDataAsArray[i] = row.toArray(new String[row.size()]);
    }
    // print
    ASCIITable.getInstance().printTable(headerTable, printDataAsArray);
  }

  public void showJadwal() {
    ASCIITableHeader[] headerTable = {
      new ASCIITableHeader("Jam"),
      new ASCIITableHeader("SENIN", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("SELASA", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("RABU", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("KAMIS", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("JUMAT", ASCIITable.ALIGN_CENTER),
    };
    for (String namaRuangan : ruangan.keySet()) {
      List<List<String>> printData = new ArrayList<>();
      System.out.println("Ruang: " + namaRuangan);
      int jam = 7;
      for (int j=0; j<11; j++) {
        List<String> data = new ArrayList<>();
        if (jam < 10) {
          data.add("0" + jam + ".00");
        } else {
          data.add(jam + ".00");
        }
        for (int h=0; h<5; h++) {
          Map<String, JadwalAssignment> jadwal = jadwalAssignment.get(h).get(j);
          if (jadwal.get(namaRuangan) != null) {
            data.add(jadwal.get(namaRuangan).getMatakuliah().getNama());
          } else {
            data.add("-");
          }
        }
        jam += 1;
        printData.add(data);
      }
      printTable(headerTable, printData);
    }
  }

  public void showDosen() {
    ASCIITableHeader[] headerTable = {
      new ASCIITableHeader("Nama Dosen", ASCIITable.ALIGN_CENTER),
    };
    List<List<String>> printData = new ArrayList<>();
    for (Dosen d : dosen.values()) {
      List<String> data = new ArrayList<>();
      data.add(d.getNama());
      printData.add(data);
    }
    printTable(headerTable, printData);
  }

  public void showFasilitas() {
    ASCIITableHeader[] headerTable = {
      new ASCIITableHeader("Fasilitas", ASCIITable.ALIGN_CENTER),
    };
    List<List<String>> printData = new ArrayList<>();
    for (Fasilitas f : fasilitas.values()) {
      List<String> data = new ArrayList<>();
      data.add(f.getNama());
      printData.add(data);
    }
    printTable(headerTable, printData);
  }

  public void showMatakuliah() {
    ASCIITableHeader[] headerTable = {
      new ASCIITableHeader("Nama Matakuliah", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("Kapasitas", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("Fasilitas", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("Jumlah sks", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("Telah terjadwal (jam)", ASCIITable.ALIGN_CENTER),
    };
    List<List<String>> printData = new ArrayList<>();
    for (Matakuliah m : matakuliah.values()) {
      List<String> data = new ArrayList<>();
      data.add(m.getNama());
      data.add(Integer.toString(m.getKapasitas()));

      Set<Fasilitas> fasilitasMatakuliah = m.getFasilitas();
      StringBuilder fasilitasAsString = new StringBuilder();
      for (Fasilitas f : fasilitasMatakuliah) {
        fasilitasAsString.append(f.getNama() + ", ");
      }
      fasilitasAsString.delete(fasilitasAsString.length()-2, fasilitasAsString.length()-1);
      data.add(fasilitasAsString.toString());

      data.add(Integer.toString(m.getSks()));
      data.add(Integer.toString(m.getAllocated()));
      printData.add(data);
    }
    printTable(headerTable, printData);
  }

  public void showRuangan() {
    ASCIITableHeader[] headerTable = {
      new ASCIITableHeader("Nama Ruangan", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("Kapasitas", ASCIITable.ALIGN_CENTER),
      new ASCIITableHeader("Fasilitas", ASCIITable.ALIGN_CENTER)
    };
    List<List<String>> printData = new ArrayList<>();
    for (Ruangan r : ruangan.values()) {
      List<String> data = new ArrayList<>();
      data.add(r.getNama());
      data.add(Integer.toString(r.getKapasitas()));

      Set<Fasilitas> fasilitasMatakuliah = r.getFasilitas();
      StringBuilder fasilitasAsString = new StringBuilder();
      for (Fasilitas f : fasilitasMatakuliah) {
        fasilitasAsString.append(f.getNama() + ", ");
      }
      fasilitasAsString.delete(fasilitasAsString.length()-2, fasilitasAsString.length()-1);
      data.add(fasilitasAsString.toString());
      printData.add(data);
    }
    printTable(headerTable, printData);
  }

  // Add/remove/update data

  public void addDosen(String namaDosen) {
    dosen.put(namaDosen, new Dosen(namaDosen));
    printPrompt("success", "Dosen " + namaDosen + " berhasil ditambahkan.");
  }

  public void updateDosen(String mode, String namaDosen, String newNamaDosen) {
    // cek reference
    boolean foundDosen = false;
    for (List<Map<String, JadwalAssignment>> j : jadwalAssignment) {
      for (Map<String, JadwalAssignment> jj : j) {
        for (JadwalAssignment jjj : jj.values()) {
          if (jjj.getDosen().getNama() == namaDosen) {
            foundDosen = true;
            break;
          }
        }
        if (foundDosen) break;
      }
      if (foundDosen) break;
    }
    if (foundDosen) {
      printPrompt("error", "Dosen "+ namaDosen + " sudah terjadwal. \nHapus dari jadwal terlebih dahulu untuk update/delete.");
    } else {
      if (mode == "update") {
        dosen.remove(namaDosen);
        dosen.put(newNamaDosen, new Dosen(newNamaDosen));
        printPrompt("success", "Dosen " + namaDosen + " berhasil diperbarui.");
      } else {
        // mode delete
        dosen.remove(namaDosen);
        printPrompt("success", "Dosen " + namaDosen + " berhasil dihapus.");
      }
    }
  }

  public void addFasilitas(String namaFasilitas) {
    fasilitas.put(namaFasilitas, new Fasilitas(namaFasilitas));
    printPrompt("success", "Fasilitas " + namaFasilitas + " berhasil ditambahkan.");
  }

  public void updateFasilitas(String mode, String namaFasilitas, String newNamaFasilitas) {
    // cek reference
    boolean foundFasilitas = false;
    for (Ruangan r : ruangan.values()) {
      for (Fasilitas f : r.getFasilitas()) {
        if (f.getNama() == namaFasilitas) {
          foundFasilitas = true;
          break;
        }
      }
      if (foundFasilitas) break;
    }
    if (!foundFasilitas) {
      for (Matakuliah m : matakuliah.values()) {
        for (Fasilitas f : m.getFasilitas()) {
          if (f.getNama() == namaFasilitas) {
            foundFasilitas = true;
            break;
          }
        }
        if (foundFasilitas) break;
      }
    }
    if (foundFasilitas) {
      printPrompt("error", "Fasilitas "+ namaFasilitas + " telah terdaftar pada matakuliah/ruangan tertentu.\nHapus dari matakuliah/ruangan terlebih dahulu untuk update/delete.");
    } else {
      if (mode == "update") {
        fasilitas.remove(namaFasilitas);
        fasilitas.put(newNamaFasilitas, new Fasilitas(newNamaFasilitas));
        printPrompt("success", "Fasilitas " + namaFasilitas + " berhasil diperbarui.");
      } else {
        // mode delete
        fasilitas.remove(namaFasilitas);
        printPrompt("delete", "Fasilitas " + namaFasilitas + " berhasil dihapus.");
      }
    }
  }

  public void addMatakuliah(String namaMatakuliah, int kapasitas, Set<Fasilitas> fasilitas, int sks, int tingkat) {
    Set<String> fasilitasJadwal = new HashSet<>();
    for (Fasilitas f: this.fasilitas.values()) {
      fasilitasJadwal.add(f.getNama());
    }
    Set<String> fasilitasMatakuliah = new HashSet<>();
    for (Fasilitas f: fasilitas) {
      fasilitasMatakuliah.add(f.getNama());
    }
    if (fasilitasJadwal.containsAll(fasilitasMatakuliah)) {
      matakuliah.put(namaMatakuliah, new Matakuliah(namaMatakuliah, kapasitas, fasilitas, sks, tingkat));
      printPrompt("success", "Matakuliah " + namaMatakuliah + " berhasil ditambahkan.");
    } else {
      Set<String> diff = new HashSet<>(fasilitasMatakuliah);
      diff.removeAll(fasilitasJadwal);
      printPrompt("error", "Matakuliah " + namaMatakuliah + "gagal ditambahkan karena fasilitas "+ diff + " belum ditambahkan.");
    }
  }

  public void updateMatakuliah(
    String mode,
    String namaMatakuliah,
    String newNamaMatakuliah,
    int newKapasitas,
    Set<Fasilitas> newFasilitas,
    int newSks,
    int newTingkat) {
    // cek reference
    boolean foundMatakuliah = false;
    for (List<Map<String, JadwalAssignment>> j : jadwalAssignment) {
      for (Map<String, JadwalAssignment> jj : j) {
        for (JadwalAssignment jjj : jj.values()) {
          if (jjj.getMatakuliah().getNama() == namaMatakuliah) {
            foundMatakuliah = true;
            break;
          }
        }
        if (foundMatakuliah) break;
      }
      if (foundMatakuliah) break;
    }
    if (foundMatakuliah) {
      printPrompt("error", "Matakuliah "+ namaMatakuliah + " sudah terjadwal. \nHapus dari jadwal terlebih dahulu untuk update/delete.");
    } else {
      if (mode == "update") {
        if (newNamaMatakuliah != null) {
          int usedKapasitas;
          Set<Fasilitas> usedFasilitas;
          int usedSks;
          int usedTingkat;
          if (newKapasitas == -1) {
            usedKapasitas = matakuliah.get(namaMatakuliah).getKapasitas();
          } else {
            usedKapasitas = newKapasitas;
          }
          if (newFasilitas != null) {
            usedFasilitas = matakuliah.get(namaMatakuliah).getFasilitas();
          } else {
            usedFasilitas = newFasilitas;
          }
          if (newSks != -1) {
            usedSks = matakuliah.get(namaMatakuliah).getSks();
          } else {
            usedSks = newSks;
          }
          if (newTingkat != -1) {
            usedTingkat = matakuliah.get(namaMatakuliah).getTingkat();
          } else {
            usedTingkat = newTingkat;
          }
          matakuliah.remove(namaMatakuliah);
          matakuliah.put(newNamaMatakuliah, new Matakuliah(newNamaMatakuliah, usedKapasitas, usedFasilitas, usedSks, usedTingkat));
        } else {
          if (newKapasitas != -1) matakuliah.get(namaMatakuliah).setKapasitas(newKapasitas);
          if (newFasilitas != null) matakuliah.get(namaMatakuliah).setFasilitas(newFasilitas);
          if (newSks != -1) matakuliah.get(namaMatakuliah).setSks(newSks);
          if (newTingkat != -1) matakuliah.get(namaMatakuliah).setTingkat(newTingkat);
        }
        printPrompt("success", "Matakuliah " + namaMatakuliah + " berhasil diperbarui.");
      } else {
        // mode delete
        matakuliah.remove(namaMatakuliah);
        printPrompt("success", "Matakuliah " + namaMatakuliah + " berhasil dihapus.");
      }
    }
  }

  public void addRuangan(String namaRuangan, int kapasitas, Set<Fasilitas> fasilitas) {
    Set<String> fasilitasJadwal = new HashSet<>();
    for (Fasilitas f: this.fasilitas.values()) {
      fasilitasJadwal.add(f.getNama());
    }
    Set<String> fasilitasRuangan = new HashSet<>();
    for (Fasilitas f: fasilitas) {
      fasilitasRuangan.add(f.getNama());
    }
    if (fasilitasJadwal.containsAll(fasilitasRuangan)) {
      ruangan.put(namaRuangan, new Ruangan(namaRuangan, kapasitas, fasilitas));
      printPrompt("success", "Ruangan " + namaRuangan + " berhasil ditambahkan.");
    } else {
      Set<String> diff = new HashSet<>(fasilitasRuangan);
      diff.removeAll(fasilitasJadwal);
      printPrompt("error", "Ruangan " + namaRuangan + "gagal ditambahkan karena fasilitas "+ diff + " belum ditambahkan.");
    }
  }

  public void updateRuangan(
    String mode,
    String namaRuangan,
    String newNamaRuangan,
    int newKapasitas,
    Set<Fasilitas> newFasilitas) {
    // cek reference
    boolean foundRuangan = false;
    for (List<Map<String, JadwalAssignment>> j : jadwalAssignment) {
      for (Map<String, JadwalAssignment> jj : j) {
        for (JadwalAssignment jjj : jj.values()) {
          if (jjj.getRuangan().getNama() == namaRuangan) {
            foundRuangan = true;
            break;
          }
        }
        if (foundRuangan) break;
      }
      if (foundRuangan) break;
    }
    if (foundRuangan) {
      printPrompt("error", "Ruangan "+ namaRuangan + " sudah terjadwal. \nHapus dari jadwal terlebih dahulu untuk update/delete.");
    } else {
      if (mode == "update") {
        if (newNamaRuangan != null) {
          int usedKapasitas;
          Set<Fasilitas> usedFasilitas;
          if (newKapasitas == -1) {
            usedKapasitas = ruangan.get(namaRuangan).getKapasitas();
          } else {
            usedKapasitas = newKapasitas;
          }
          if (newFasilitas != null) {
            usedFasilitas = ruangan.get(namaRuangan).getFasilitas();
          } else {
            usedFasilitas = newFasilitas;
          }
          ruangan.remove(namaRuangan);
          ruangan.put(newNamaRuangan, new Ruangan(newNamaRuangan, usedKapasitas, usedFasilitas));
        } else {
          if (newKapasitas != -1) ruangan.get(namaRuangan).setKapasitas(newKapasitas);
          if (newFasilitas != null) ruangan.get(namaRuangan).setFasilitas(newFasilitas);
        }
        printPrompt("success", "Ruangan " + namaRuangan + " berhasil diperbarui.");
      } else {
        // mode delete
        ruangan.remove(namaRuangan);
        printPrompt("success", "Ruangan " + namaRuangan + " berhasil dihapus.");
      }
    }
  }

  // Getters

  public String getNama() {
    return nama;
  }

  public Map<String, Dosen> getDosen() {
    return dosen;
  }

  public Map<String, Fasilitas> getFasilitas() {
    return fasilitas;
  }

  public Map<String, Matakuliah> getMatakuliah() {
    return matakuliah;
  }

  public Map<String, Ruangan> getRuangan() {
    return ruangan;
  }

  public List<List<Map<String, JadwalAssignment>>> getJadwalAssignment() {
    return jadwalAssignment;
  }

}