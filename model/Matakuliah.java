public class Matakuliah {
  
  private String nama;
  private int kapasitas;
  private Set<Fasilitas> fasilitas;
  private boolean isAssigned;

  public Matakuliah() {
    fasilitas = new HashSet<>();
    this.isAssigned = false;
  }

  public Matakuliah(String nama, int kapasitas, Set<Fasilitas> fasilitas) {
    this.nama = nama;
    this.kapasitas = kapasitas;
    this.fasilitas = fasilitas;
    this.isAssigned = false;
  }

  public addFasilitas(String namaFasilitas) {
    this.fasilitas.add(new Fasilitas(namaFasilitas));
  }

  public removeFasilitas(String namaFasilitas) {
    this.fasilitas.remove(new Fasilitas(namaFasilitas));
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getKapasitas() {
    return kapasitas;
  }

  public void setKapasitas(int kapasitas) {
    this.kapasitas = kapasitas;
  }

  public String getFasilitas() {
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

}