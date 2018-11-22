import java.util.*;
import model.*;
import com.bethecoder.ascii_table.*;

public class Test {
  public static void main(String[] args) {
    Jadwal jadwal = new Jadwal("Kuliah");

    // TEST DOSEN
    jadwal.addDosen("Adi");
    jadwal.addDosen("John");
    
    // TEST FASILITAS
    jadwal.addFasilitas("Papan tulis");
    jadwal.addFasilitas("Meja");
    // jadwal.removeFasilitas("Meja");

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
    jadwal.addRuangan("7609", 100, fas2);

    // TEST ASSIGN
    jadwal.assignTo("IF4072", "7602", "Adi", 1, 9, 3);
    jadwal.assignTo("IF4071", "7609", "John", 2, 3, 2);
    jadwal.unassignFrom("7602", 1, 9, 3);
    // jadwal.assignTo("IF4071", "7605", "John", 1, 1);
    
    // TEST SHOW
    // jadwal.showDosen();
    // jadwal.showFasilitas();
    // jadwal.showMatakuliah();

    jadwal.showJadwal();
    jadwal.showDosen();
    jadwal.showFasilitas();

    // ASCIITableHeader[] headerObjs = {
      // new ASCIITableHeader("User Name", ASCIITable.ALIGN_LEFT),
      // new ASCIITableHeader("Salary"),
      // new ASCIITableHeader("Designation", ASCIITable.ALIGN_CENTER),
      // new ASCIITableHeader("Address", ASCIITable.ALIGN_LEFT),
      // new ASCIITableHeader("Lucky#", ASCIITable.ALIGN_RIGHT),
    // };

    // String[][] data = {
    //   { "Sri", "12000", "Developer", "BTM Layout", "22222" },
    //   { "Prasad", "42000", "Lead", "#66, Viaya Bank Layout", "333333" },
    //   { "Anu", "132000", "QA", "#22, Vizag", "4444444" },
    //   { "Sai", "62000", "Developer", "#3-3, Kakinada"  },
    //   { "Venkat", "2000", "Manager"   },
    //   { "Raj", "62000"},
    //   { "BTC"},
    // };

    // ASCIITable.getInstance().printTable(headerObjs, data);

  }
}