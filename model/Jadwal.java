package model;

import java.util.*;
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
      System.out.println("Berhasil!");
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
      if (matakuliah.get(namaMatakuliah).alllocableHours() < durasi) {
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

  // show methods

  public void showJadwal() {
    StringBuilder result = new StringBuilder();
    int hari = 1;
    for (List<Map<String, JadwalAssignment>> j : jadwalAssignment) {
      result.append("Hari ke-" + hari + "\n");
      int jam = 1;
      for (Map<String, JadwalAssignment> jj : j) {
        result.append(jam + "   ");
        for (String namaRuangan : ruangan.keySet()) {
          JadwalAssignment jadwal = jj.get(namaRuangan);
          if (jadwal != null) {
            result.append(namaRuangan + ": " + jadwal.getMatakuliah().getNama() + "; ");
          } else {
            result.append(namaRuangan + ": - ; ");
          }
        }
        result.append("\n");
        jam += 1;
      }
      hari += 1;
    }
    System.out.print(result);
  }

  public void showDosen() {
    StringBuilder result = new StringBuilder();
    for (Dosen d : dosen.values()) {
      result.append(d.getNama() + "\n");
    }
    System.out.print(result);
  }

  public void showFasilitas() {
    StringBuilder result = new StringBuilder();
    for (Fasilitas f : fasilitas.values()) {
      result.append(f.getNama() + "\n");
    }
    System.out.print(result);
  }

  public void showMatakuliah() {
    StringBuilder result = new StringBuilder();
    for (Matakuliah m : matakuliah.values()) {
      result.append(m.getNama() + " " + m.getKapasitas() + " " + m.getFasilitas() + " " + m.getAllocated() +"\n");
    }
    System.out.print(result);
  }

  public void showRuangan() {
    StringBuilder result = new StringBuilder();
    for (Ruangan r : ruangan.values()) {
      result.append(r.getNama() + " " + r.getKapasitas() + " " + r.getFasilitas() +"\n");
    }
    System.out.print(result);
  }

  // Set manipulations

  public void addDosen(String namaDosen) {
    dosen.put(namaDosen, new Dosen(namaDosen));
  }

  public void removeDosen(String namaDosen) {
    dosen.remove(namaDosen);
  }

  public void addFasilitas(String namaFasilitas) {
    fasilitas.put(namaFasilitas, new Fasilitas(namaFasilitas));
  }

  public void removeFasilitas(String namaFasilitas) {
    fasilitas.remove(namaFasilitas);
  }

  public void addMatakuliah(String namaMatakuliah, int kapasitas, Set<Fasilitas> fasilitas, int sks, int tingkat) {
    matakuliah.put(namaMatakuliah, new Matakuliah(namaMatakuliah, kapasitas, fasilitas, sks, tingkat));
  }

  public void removeMatakuliah(String namaMatakuliah) {
    matakuliah.remove(namaMatakuliah);
  }

  public void addRuangan(String namaRuangan, int kapasitas, Set<Fasilitas> fasilitas) {
    ruangan.put(namaRuangan, new Ruangan(namaRuangan, kapasitas, fasilitas));
  }

  public void removeRuangan(String namaRuangan) {
    ruangan.remove(namaRuangan);
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