package utils;
import antlrfiles.*;

public class CustomParser {
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
            String name = ctx.Name(0).getText();

        } else if (basicOperator.equals("DELETE")) {
            String name = ctx.Name(0).getText();

        } else if (basicOperator.equals("UPDATE")) {
            String name = ctx.Name(0).getText();
            String updatedName = ctx.Name(1).getText();

        }
    }

    public static void parseRuangan(ScheduleParser.ModelContext ctx) {
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

    public static void parseFasilitas(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            String name = ctx.Name(0).getText();

        } else if (basicOperator.equals("DELETE")) {
            String name = ctx.Name(0).getText();

        } else if (basicOperator.equals("UPDATE")) {
            String name = ctx.Name(0).getText();
            String updatedName = ctx.Name(1).getText();
            
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