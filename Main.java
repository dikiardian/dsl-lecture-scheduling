import java.io.*;
import java.util.*;
import java.nio.charset.*;
import org.antlr.v4.runtime.*;
import antlrfiles.*;
import model.*;
import utils.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CustomParser.jadwal = new Jadwal("Jadwalku");
        while(true) {
            String query = scanner.nextLine();
            InputStream stream = new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8));
            CharStream cs = new ANTLRInputStream(stream);
            ScheduleLexer lexer = new ScheduleLexer(cs);            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ScheduleParser parser = new ScheduleParser(tokens); 
            parser.addParseListener(new ScheduleBaseListener());
            parser.model();
            // parser.assign();
            // parser.end();
        }
    }
}