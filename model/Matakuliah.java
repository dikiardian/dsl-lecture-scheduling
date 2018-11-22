package model;

import java.util.*;
public class Matakuliah {
  
  private String nama;
  private int kapasitas;
  private Set<Fasilitas> fasilitas;
  private int sks;
  private int tingkat;
  private boolean isAssigned;

  public Matakuliah() {
    fasilitas = new HashSet<>();
    this.isAssigned = false;
  }

  public Matakuliah(String nama, int kapasitas, Set<Fasilitas> fasilitas, int sks, int tingkat) {
    this.nama = nama;
    this.kapasitas = kapasitas;
    this.fasilitas = fasilitas;
    this.sks = sks;
    this.tingkat = tingkat;
    this.isAssigned = false;
  }

  public void addFasilitas(String namaFasilitas) {
    fasilitas.add(new Fasilitas(namaFasilitas));
  }

  public void removeFasilitas(String namaFasilitas) {
    fasilitas.removeIf(f -> (f.getNama() == namaFasilitas));
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getKapasitas() {
    return kapasitas;
  }

  public void setKapasitas(int kapasitas) {
    this.kapasitas = kapasitas;
  }

  public Set<Fasilitas> getFasilitas() {
    return fasilitas;
  }

  public void setFasilitas(Set<Fasilitas> fasilitas) {
    this.fasilitas = fasilitas;
  }
  
  public boolean getIsAssigned() {
    return isAssigned;
  }

  public void setIsAssigned(boolean isAssigned) {
    this.isAssigned = isAssigned;
  }

  public int getSks() {
    return sks;
  }

  public void setSks(int sks) {
    this.sks = sks;
  }

  public int getTingkat() {
    return tingkat;
  }

  public void setTingkat(int tingkat) {
    this.tingkat = tingkat;
  }
}