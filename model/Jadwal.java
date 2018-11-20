import java.util.ArrayList;

public class Jadwal {
  
  private String nama;
  private Set<Dosen> dosen;
  private Set<Fasilitas> fasilitas;
  private Set<Matakuliah> matakuliah;
  private Set<Ruangan> ruangan;
  private Set<JadwalAssignment> jadwalAssignment;
  private List<List<Integer>> waktu;

  public Jadwal(String nama) {
    this.nama = nama;
    dosen = new HashSet<>();
    fasilitas = new HashSet<>();
    matakuliah = new HashSet<>();
    ruangan = new HashSet<>();
    jadwalAssignment = new HashSet<>();

    waktu = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      jam = new ArrayList<>();
      for (int j = 1; j <= 11; j++) {
        jam.add(j);
      }
      waktu.add(jam);
    }
  }

  // Set manipulations

  public addDosen(String namaDosen) {
    this.dosen.add(new Dosen(namaDosen));
  }

  public removeDosen(String namaDosen) {
    this.dosen.remove(new Dosen(namaDosen));
  }

  public addFasilitas(String namaFasilitas) {
    this.fasilitas.add(new Fasilitas(namaFasilitas));
  }

  public removeFasilitas(String namaFasilitas) {
    this.fasilitas.remove(new Fasilitas(namaFasilitas));
  }

  public addMatakuliah(String namaMatakuliah, int kapasitas, Set<Fasilitas> fasilitas) {
    this.matakuliah.add(new Matakuliah(namaMatakuliah, kapasitas, fasilitas));
  }

  public removeMatakuliah(String namaMatakuliah, int kapasitas, Set<Fasilitas> fasilitas) {
    this.matakuliah.remove(new Matakuliah(namaMatakuliah, kapasitas, fasilitas));
  }

  public addRuangan(String namaRuangan, int kapasitas, Set<Fasilitas> fasilitas) {
    this.ruangan.add(new Ruangan(namaRuangan, kapasitas, fasilitas));
  }

  public removeRuangan(String namaRuangan, int kapasitas, Set<Fasilitas> fasilitas) {
    this.ruangan.remove(new Ruangan(namaRuangan, kapasitas, fasilitas));
  }

  public addJadwalAssignment(Matakuliah matakuliah, Ruangan ruangan, Dosen dosen, int hari, int jam) {
    this.jadwalAssignment.add(new JadwalAssignment(matakuliah, ruangan, dosen, hari, jam));
  }

  public removeJadwalAssignment(Matakuliah matakuliah, Ruangan ruangan, Dosen dosen, int hari, int jam) {
    this.jadwalAssignment.remove(new JadwalAssignment(matakuliah, ruangan, dosen, hari, jam));
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