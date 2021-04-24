package com.itmady1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogParser {

    public String directory;

    public LogParser(String directory) throws FileNotFoundException, IOException {
        this.directory = directory;


        Logger.LOGGER2.info("taking directory "+ this.directory);

        File dir = new File(directory);
        Logger.LOGGER2.info("we found some logs");

        System.out.println(Arrays.toString(dir.listFiles()));

        ArrayList<Log> arrayList1 = new ArrayList<Log>();
        try {
            BufferedReader br = null;
            for (File item : dir.listFiles()) {
                System.out.println(item);
                br = new BufferedReader(new FileReader(item));
                String s;
                while ((s = br.readLine()) != null) {
                    String[] array1 = s.split("\t");
                    arrayList1.add(new Log(array1));
                }
            }
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
            Logger.LOGGER2.error(e.getMessage());
        }
        Logger.LOGGER2.info("Created the ArrayList<Log>");
        System.out.println();
        System.out.println();
        System.out.println("--------------The log messages are with OK status:------------");
        System.out.println();

        for (
                Log log : arrayList1) {
            if (log.getStatus().equals("OK")) {
                String s = log.toString();
                System.out.println(log.toString());
            }
        }

        try (BufferedWriter bwr = new BufferedWriter(new FileWriter("C://Somelogs/newfile.txt"))) {
            System.out.println("====================: writing to file ");
            for (Log log : arrayList1) {
                if (log.getStatus().equals("OK")) {
                    bwr.write(log.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            Logger.LOGGER2.error(e.getMessage());
        }
        Logger.LOGGER2.info("Created log file with students - OK status.");
    }
}

