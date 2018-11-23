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
        else if (kind.equals("JADWAL")) { parseJadwal(ctx); }
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
            String name = ctx.Name(0).getText().replace("\"", "");
            jadwal.updateDosen("delete", name, null);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            String newName = ctx.Name(1).getText().replace("\"", "");
            jadwal.updateDosen("update", name, newName);

        } else if (basicOperator.equals("SHOW")) {
            if (jadwal.getDosen().size() > 0) {
                //TODO: Cek input length
                jadwal.showDosen();
            } else {
                jadwal.printPrompt("error", "Belum ada dosen yang ditambahkan.");
            }
        }
    }

    public static void parseRuangan(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            int capacity;
            try {
                capacity = Integer.parseInt(ctx.Capacity(0).getText());
            } catch (Exception e) {
                jadwal.printPrompt("error", "Pastikan atribut kapasitas bernilai angka");
                return;
            }
            String facility = ctx.Facility(0).getText().replace("[", "").replace("]", "");
            List<String> facilityAsList = new ArrayList<String>(Arrays.asList(facility.split(",")));
            Set<Fasilitas> facilities = new HashSet<>();

            for (String f : facilityAsList) {
                facilities.add(new Fasilitas(f.replace("\"", "").trim()));
            }

            jadwal.addRuangan(name, capacity, facilities);

        } else if (basicOperator.equals("DELETE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            jadwal.updateRuangan("delete", name, null, -1, null);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            String updatedName;
            if (ctx.Name(1).getText() != null) {
                updatedName = ctx.Name(1).getText().replace("\"", "");
            } else {
                updatedName = null;
            }
            int updatedCapacity;
            if (ctx.Capacity(0).getText() != null) {
                try {
                    updatedCapacity = Integer.parseInt(ctx.Capacity(0).getText());
                } catch (Exception e) {
                    jadwal.printPrompt("error", "Pastikan atribut kapasitas bernilai angka");
                    return;
                }
            } else {
                updatedCapacity = -1;
            }
            
            Set<Fasilitas> updatedFacility;
            if (ctx.Facility(0).getText() != null) {
                String facility = ctx.Facility(0).getText().replace("[", "").replace("]", "");
                List<String> facilityAsList = new ArrayList<String>(Arrays.asList(facility.split(",")));
                updatedFacility = new HashSet<>();

                for (String f : facilityAsList) {
                    updatedFacility.add(new Fasilitas(f.replace("\"", "").trim()));
                }
            } else {
                updatedFacility = null;
            }
            jadwal.updateRuangan("update", name, updatedName, updatedCapacity, updatedFacility);

        } else if (basicOperator.equals("SHOW")) {
            if (jadwal.getRuangan().size() > 0) {
                //TODO: Cek input length
                jadwal.showRuangan();
            } else {
                jadwal.printPrompt("error", "Belum ada ruangan yang ditambahkan.");
            }
        }
    }

    public static void parseFasilitas(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            jadwal.addFasilitas(name);

        } else if (basicOperator.equals("DELETE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            jadwal.updateFasilitas("delete", name, null);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            String updatedName = ctx.Name(1).getText().replace("\"", "");
            jadwal.updateFasilitas("update", name, updatedName);

        } else if (basicOperator.equals("SHOW")) {
            if (jadwal.getFasilitas().size() > 0) {
                //TODO: Cek input length
                jadwal.showFasilitas();
            } else {
                jadwal.printPrompt("error", "Belum ada fasilitas yang ditambahkan.");
            }
        }
    }

    public static void parseMatakuliah(ScheduleParser.ModelContext ctx) {
        String basicOperator = ctx.BasicOperator().getText();
        if (basicOperator.equals("ADD")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            int capacity;
            try {
                capacity = Integer.parseInt(ctx.Capacity(0).getText());
            } catch (Exception e) {
                jadwal.printPrompt("error", "Pastikan atribut kapasitas bernilai angka");
                return;
            }
            String facility = ctx.Facility(0).getText().replace("[", "").replace("]", "");
            List<String> facilityAsList = new ArrayList<String>(Arrays.asList(facility.split(",")));
            Set<Fasilitas> facilities = new HashSet<>();

            for (String f : facilityAsList) {
                facilities.add(new Fasilitas(f.replace("\"", "").trim()));
            }

            int sks;
            try {
                sks = Integer.parseInt(ctx.Sks(0).getText());
            } catch (Exception e) {
                jadwal.printPrompt("error", "Pastikan atribut sks bernilai angka");
                return;
            }

            int tingkat;
            try {
                tingkat = Integer.parseInt(ctx.Tingkat(0).getText());
            } catch (Exception e) {
                jadwal.printPrompt("error", "Pastikan atribut tingkat bernilai angka");
                return;
            }

            jadwal.addMatakuliah(name, capacity, facilities, sks, tingkat);

        } else if (basicOperator.equals("DELETE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            jadwal.updateMatakuliah("delete", name, null, -1, null, -1, -1);

        } else if (basicOperator.equals("UPDATE")) {
            //TODO: Cek input length
            String name = ctx.Name(0).getText().replace("\"", "");
            String updatedName;
            if (ctx.Name(1).getText() != null) {
                updatedName = ctx.Name(1).getText().replace("\"", "");
            } else {
                updatedName = null;
            }
            int updatedCapacity;
            if (ctx.Capacity(0).getText() != null) {
                try {
                    updatedCapacity = Integer.parseInt(ctx.Capacity(0).getText());
                } catch (Exception e) {
                    jadwal.printPrompt("error", "Pastikan atribut kapasitas bernilai angka");
                    return;
                }
            } else {
                updatedCapacity = -1;
            }
            
            Set<Fasilitas> updatedFacility;
            if (ctx.Facility(0).getText() != null) {
                String facility = ctx.Facility(0).getText().replace("[", "").replace("]", "");
                List<String> facilityAsList = new ArrayList<String>(Arrays.asList(facility.split(",")));
                updatedFacility = new HashSet<>();

                for (String f : facilityAsList) {
                    updatedFacility.add(new Fasilitas(f.replace("\"", "").trim()));
                }
            } else {
                updatedFacility = null;
            }

            int updatedSks;
            if (ctx.Sks(0).getText() != null) {
                try {
                    updatedSks = Integer.parseInt(ctx.Sks(0).getText());
                } catch (Exception e) {
                    jadwal.printPrompt("error", "Pastikan atribut sks bernilai angka");
                    return;
                }
            } else {
                updatedSks = -1;
            }

            int updatedTingkat;
            if (ctx.Tingkat(0).getText() != null) {
                try {
                    updatedTingkat = Integer.parseInt(ctx.Tingkat(0).getText());
                } catch (Exception e) {
                    jadwal.printPrompt("error", "Pastikan atribut tingkat bernilai angka");
                    return;
                }
            } else {
                updatedTingkat = -1;
            }

            jadwal.updateMatakuliah("update", name, updatedName, updatedCapacity, updatedFacility, updatedSks, updatedTingkat);
            
        } else if (basicOperator.equals("SHOW")) {
            if (jadwal.getMatakuliah().size() > 0) {
                //TODO: Cek input length
                jadwal.showMatakuliah();
            } else {
                jadwal.printPrompt("error", "Belum ada matakuliah yang ditambahkan.");
            }
        }
    }

    public static void parseJadwal(ScheduleParser.ModelContext ctx) {
        if (jadwal.getRuangan().size() > 0) {
            String basicOperator = ctx.BasicOperator().getText();
            if (basicOperator.equals("SHOW")) {
                //TODO: Cek input length
                jadwal.showJadwal();
            }
        } else {
            jadwal.printPrompt("error", "Belum ada ruangan yang ditambahkan.");
        }
    }
}