package model;

public class JadwalAssignment {
  
  private Matakuliah matakuliah;
  private Ruangan ruangan;
  private Dosen dosen;
  private boolean isSet;

  public JadwalAssignment() {
    isSet = false;
  }

  public JadwalAssignment(Matakuliah matakuliah, Ruangan ruangan, Dosen dosen) {
    this.matakuliah = matakuliah;
    this.ruangan = ruangan;
    this.dosen = dosen;
    isSet = true;
  }

  @Override
  public String toString() {
    return matakuliah.getNama() + ' ' + ruangan.getNama() + ' ' + dosen.getNama();
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

  public boolean getIsSet() {
    return isSet;
  }

  public void setMatakuliah(Matakuliah matakuliah) {
    this.matakuliah = matakuliah;
  }

  public void setDosen(Dosen dosen) {
    this.dosen = dosen;
  }

  public void setRuangan(Ruangan ruangan) {
    this.ruangan = ruangan;
  }

  public void setIsSet(boolean isSet) {
    this.isSet = isSet;
  }

  public void setJadwal(Matakuliah matakuliah, Dosen dosen, Ruangan ruangan) {
    this.matakuliah = matakuliah;
    this.dosen = dosen;
    this.ruangan = ruangan;
  }
}