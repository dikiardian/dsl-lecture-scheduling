import model.*;

public class Test {
  public static void main(String[] args) {
    Jadwal jadwal = new Jadwal("Kuliah");
    jadwal.addDosen("Adi");
    jadwal.addDosen("John");
    jadwal.addFasilitas("Papan tulis");
    jadwal.addFasilitas("Meja");
    jadwal.removeDosen("Adi");
    jadwal.showDosen();
    jadwal.showFasilitas();
  }
}