package model;

import java.util.*;

public class Ruangan {
  
  private String nama;
  private int kapasitas;
  private Set<Fasilitas> fasilitas;
  private boolean isEmpty;

  public Ruangan() {
    fasilitas = new HashSet<>();
    isEmpty = true;
  }

  public Ruangan(String nama, int kapasitas, Set<Fasilitas> fasilitas) {
    this.nama = nama;
    this.kapasitas = kapasitas;
    this.fasilitas = fasilitas;
    isEmpty = true;
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

  public boolean getIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

}