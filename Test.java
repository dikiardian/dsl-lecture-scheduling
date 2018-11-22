import java.util.*;
import model.*;

public class Test {
  public static void main(String[] args) {
    Jadwal jadwal = new Jadwal("Kuliah");

    // TEST DOSEN
    jadwal.addDosen("Adi");
    jadwal.addDosen("John");
    // jadwal.removeDosen("Adi");
    
    // TEST FASILITAS
    jadwal.addFasilitas("Papan tulis");
    jadwal.addFasilitas("Meja");
    jadwal.removeFasilitas("Meja");

    // TEST MATAKULIAH
    Fasilitas fasilitas1 = new Fasilitas("Meja");
    Fasilitas fasilitas2 = new Fasilitas("Papan tulis");
    
    Set<Fasilitas> fas1 = new HashSet<>();
    fas1.add(fasilitas1);
    fas1.add(fasilitas2);

    Set<Fasilitas> fas2 = new HashSet<>();
    fas2.add(fasilitas1);

    jadwal.addMatakuliah("IF4072", 50, fas1, 3, 3);
    jadwal.addMatakuliah("IF4071", 45, fas2, 2, 1);

    // TEST RUANGAN
    jadwal.addRuangan("7602", 60, fas1);
    jadwal.addRuangan("7605", 50, fas2);

    // TEST ASSIGN
    jadwal.assignTo("IF4072", "7602", "Adi", 1, 9, 2);
    // System.out.println("Sisa  sks: " + jadwal.getMatakuliah().get("7602").getAllocated());
    // jadwal.unassignFrom("IF4072", 1, 2, 1);
    // jadwal.assignTo("IF4071", "7605", "John", 1, 1);
    
    // TEST SHOW
    // jadwal.showDosen();
    // jadwal.showFasilitas();
    jadwal.showMatakuliah();
    // jadwal.showRuangan();

    jadwal.showJadwal();

  }
}