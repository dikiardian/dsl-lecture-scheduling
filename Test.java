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

    jadwal.addMatakuliah("IF4072", 50, fas1, 2, 2);
    jadwal.addMatakuliah("IF4071", 45, fas2, 2, 2);

    // TEST RUANGAN
    jadwal.addRuangan("7602", 60, fas1);
    jadwal.addRuangan("7605", 30, fas2);

    // TEST ASSIGN
    jadwal.assignTo("IF4072", "7602", "Adi", 1, 1);
    
    // TEST SHOW
    // jadwal.showDosen();
    // jadwal.showFasilitas();
    // jadwal.showMatakuliah();
    // jadwal.showRuangan();

    jadwal.showJadwal();

  }
}