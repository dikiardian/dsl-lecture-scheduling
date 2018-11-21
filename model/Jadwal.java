package model;

import java.util.*;
public class Jadwal {
  
  private String nama;
  private Set<Dosen> dosen;
  private Set<Fasilitas> fasilitas;
  private Set<Matakuliah> matakuliah;
  private Set<Ruangan> ruangan;
  private Set<JadwalAssignment> jadwalAssignment;
  public List<List<Integer>> waktu;

  public Jadwal(String nama) {
    this.nama = nama;
    dosen = new HashSet<>();
    fasilitas = new HashSet<>();
    matakuliah = new HashSet<>();
    ruangan = new HashSet<>();
    jadwalAssignment = new HashSet<>();

    waktu = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      List<Integer> jam = new ArrayList<>();
      for (int j = 1; j <= 11; j++) {
        jam.add(j);
      }
      waktu.add(jam);
    }
  }

  // show methods

  public String showJadwal() {
    return "";
  }

  public void showDosen() {
    StringBuilder result = new StringBuilder();
    for (Dosen d : dosen) {
      result.append(d.getNama() + "\n");
    }
    System.out.print(result);
  }

  public void showFasilitas() {
    StringBuilder result = new StringBuilder();
    for (Fasilitas f : fasilitas) {
      result.append(f.getNama() + "\n");
    }
    System.out.print(result);
  }

  public void showMatakuliah() {
    StringBuilder result = new StringBuilder();
    for (Matakuliah m : matakuliah) {
      result.append(m.getNama() + "\n");
    }
    System.out.print(result);
  }

  public void showRuangan() {
    StringBuilder result = new StringBuilder();
    for (Ruangan r : ruangan) {
      result.append(r.getNama() + "\n");
    }
    System.out.print(result);
  }


  // Set manipulations

  public void addDosen(String namaDosen) {
    dosen.add(new Dosen(namaDosen));
  }

  public void removeDosen(String namaDosen) {
    dosen.removeIf(d -> (d.getNama() == namaDosen));
  }

  public void addFasilitas(String namaFasilitas) {
    fasilitas.add(new Fasilitas(namaFasilitas));
  }

  public void removeFasilitas(String namaFasilitas) {
    fasilitas.removeIf(f -> (f.getNama() == namaFasilitas));
  }

  public void addMatakuliah(String namaMatakuliah, int kapasitas, Set<Fasilitas> fasilitas) {
    matakuliah.add(new Matakuliah(namaMatakuliah, kapasitas, fasilitas));
  }

  public void removeMatakuliah(String namaMatakuliah) {
    matakuliah.removeIf(m -> (m.getNama() == namaMatakuliah));
  }

  public void addRuangan(String namaRuangan, int kapasitas, Set<Fasilitas> fasilitas) {
    ruangan.add(new Ruangan(namaRuangan, kapasitas, fasilitas));
  }

  public void removeRuangan(String namaRuangan) {
    ruangan.removeIf(r -> (r.getNama() == namaRuangan));
  }

  public void addJadwalAssignment(Matakuliah matakuliah, Ruangan ruangan, Dosen dosen, int hari, int jam) {
    jadwalAssignment.add(new JadwalAssignment(matakuliah, ruangan, dosen, hari, jam));
  }

  public void removeJadwalAssignment(
    String namaMatakuliah,
    String namaRuangan,
    int hari,
    int jam) {
    jadwalAssignment.removeIf(j -> (
      j.getMatakuliah().getNama() == namaMatakuliah && 
      j.getRuangan().getNama() == namaRuangan &&
      j.getHari() == hari &&
      j.getJam() == jam));
  }

  // Getters

  public String getNama() {
    return nama;
  }

  public Set<Dosen> getDosen() {
    return dosen;
  }

  public Set<Fasilitas> getFasilitas() {
    return fasilitas;
  }

  public Set<Matakuliah> getMatakuliah() {
    return matakuliah;
  }

  public Set<Ruangan> getRuangan() {
    return ruangan;
  }

  public Set<JadwalAssignment> getJadwalAssignment() {
    return jadwalAssignment;
  }

}