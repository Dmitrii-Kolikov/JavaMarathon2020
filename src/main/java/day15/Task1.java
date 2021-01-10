package day15;

import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Dmitry\\Desktop\\JavaMarathon\\JavaMarathon2020\\src\\main\\resources\\shoes.csv"), ';');
        String[] nextLine;
        File fac = new File("C:\\Users\\Dmitry\\Desktop\\JavaMarathon\\JavaMarathon2020\\src\\main\\resources\\Check");
        PrintWriter pw = new PrintWriter(fac);

        List<String[]> s = new ArrayList<>();
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine[2].equals("0")) {
                pw.println(Arrays.toString(nextLine).replaceAll("\\[|\\]", ""));
            }
                }
        pw.close();
        }
            }





