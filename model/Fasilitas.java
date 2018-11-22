package model;

public class Fasilitas {

  private String nama;

  public Fasilitas() {
    
  }

  public Fasilitas(String nama) {
    this.nama = nama;
  }

  @Override
  public String toString() {
    return nama;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

}