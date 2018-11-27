import java.io.*;
import java.util.*;
import java.nio.charset.*;
import org.antlr.v4.runtime.*;
import antlrfiles.*;
import model.*;
import utils.*;

class Main {
    public static final ArrayList<String> basicOperators = new ArrayList<>(Arrays.asList("ADD", "DELETE", "UPDATE", "SHOW"));
    public static final ArrayList<String> assignOperators = new ArrayList<>(Arrays.asList("ASSIGN", "REMOVE"));
    public static final ArrayList<String> endOperators = new ArrayList<>(Arrays.asList("EXIT", "HELP"));

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CustomParser.jadwal = new Jadwal("Jadwalku");
        System.out.println("Masukkan \"HELP\" untuk bantuan command");

        while(true) {
            // System.out.print("> ");
            String query = scanner.nextLine();
            InputStream stream = new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8));
            CharStream cs = new ANTLRInputStream(stream);
            ScheduleLexer lexer = new ScheduleLexer(cs);            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ScheduleParser parser = new ScheduleParser(tokens); 
            parser.addParseListener(new ScheduleBaseListener());
            
            String operator = query.split(" ")[0];
            if (basicOperators.contains(operator)) {
                parser.model();
            } else if (assignOperators.contains(operator)) {
                parser.assign();
            } else if (endOperators.contains(operator)) {
                parser.end();
            }
        }
    }
}