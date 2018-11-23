package utils;

import java.util.*;
import antlrfiles.*;
import model.*;

public class CustomParser {
    public static Jadwal jadwal;

    public static void parseModel(ScheduleParser.ModelContext ctx) {
        String kind = ctx.Kind().getText();
        if (kind.equals("DOSEN")) { parseDosen(ctx); } 
        else if (kind.equals("RUANGAN")) { parseRuangan(ctx); } 
        else if (kind.equals("FASILITAS")) { parseFasilitas(ctx); } 
        else if (kind.equals("MATAKULIAH")) { parseMatakuliah(ctx); }
    }

    public static void parseAssign(ScheduleParser.AssignContext ctx) {
        //TODO: Silahkan diparse
        //Example: ctx.Kind().getText() or ctx.Name(0).getText() or ctx.Name(1).getText()
    }

    public static void parseEnd(ScheduleParser.EndContext ctx) {
        //TODO: Program Exit
    }

    public static void parseDosen(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            jadwal.addDosen(name);

        } else if (basicOperator.equals("DELETE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            jadwal.removeDosen(name);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            String updatedName = ctx.Name(1).getText().substring(3);
            //TODO: UPDATE

        } else if (basicOperator.equals("SHOW")) {
            //TODO: Cek input length
            jadwal.showDosen();
        }
    }

    public static void parseRuangan(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            //TODO: Cek input length
            // String name = ctx.Name(0).getText();
            // String capacity = ctx.Capacity(0).getText();
            // String facility = ctx.Facility(0).getText();
            // System.out.println(name + " " + capacity + " " + facility);
            String name = ctx.Name(0).getText().replace("\"", "");
            String capacity = ctx.Capacity(0).getText();
            String facility = ctx.Facility(0).getText().replace("[", "").replace("]", "");
            List<String> facilityAsList = new ArrayList<String>(Arrays.asList(facility.split(",")));
            Set<Fasilitas> facilities = new HashSet<>();

            for (String f : facilityAsList) {
                facilities.add(new Fasilitas(f.replace("\"", "").trim()));
            }

            jadwal.addRuangan(name, Integer.parseInt(capacity), facilities);

        } else if (basicOperator.equals("DELETE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            jadwal.removeRuangan(name);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            String updatedName = ctx.Name(1).getText().substring(3);
            String updatedCapacity = ctx.Capacity(0).getText().substring(3);
            String updatedFacility = ctx.Facility(0).getText().substring(3);
            //TODO: UPDATE RUANGAN

        } else if (basicOperator.equals("SHOW")) {
            //TODO: Cek input length
            jadwal.showRuangan();
        }
    }

    public static void parseFasilitas(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            jadwal.addFasilitas(name);

        } else if (basicOperator.equals("DELETE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            jadwal.removeFasilitas(name);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().substring(3);
            String updatedName = ctx.Name(1).getText().substring(3);
            //TODO: UPDATE

        } else if (basicOperator.equals("SHOW")) {
            //TODO: Cek input length
            jadwal.showFasilitas();
        }
    }

    public static void parseMatakuliah(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            String name = ctx.Name(0).getText();
            String capacity = ctx.Capacity(0).getText();
            String facility = ctx.Facility(0).getText();

        } else if (basicOperator.equals("DELETE")) {
            String name = ctx.Name(0).getText();

        } else if (basicOperator.equals("UPDATE")) {
            String name = ctx.Name(0).getText();
            String updatedName = ctx.Name(1).getText();
            String updatedCapacity = ctx.Capacity(0).getText();
            String updatedFacility = ctx.Facility(0).getText();
            
        }
    }
}