package model;

public class JadwalAssignment {
  
  private Matakuliah matakuliah;
  private Ruangan ruangan;
  private Dosen dosen;
  private int hari;
  private int jam;

  public JadwalAssignment() {
    
  }

  public JadwalAssignment(Matakuliah matakuliah, Ruangan ruangan, Dosen dosen, int hari, int jam) {
    this.matakuliah = matakuliah;
    this.ruangan = ruangan;
    this.dosen = dosen;
    this.hari = hari;
    this.jam = jam;
  }

  public Matakuliah getMatakuliah() {
    return matakuliah;
  }

  public Ruangan getRuangan() {
    return ruangan;
  }

  public Dosen getDosen() {
    return dosen;
  }

  public int getHari() {
    return hari;
  }

  public int getJam() {
    return jam;
  }

}