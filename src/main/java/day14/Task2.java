package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)  {
        File file = new File("people.txt");
        System.out.println(Task2.parseFileToStringList(file));

    }
    public static List<String> parseFileToStringList(File file)  {
        int value = 0;
        Scanner scanner = null;
        List<String> parseFileToStringList = new ArrayList<>();

        try {
            scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            parseFileToStringList.add(scanner.nextLine());
        }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for(String x:parseFileToStringList) {
            value = Integer.parseInt(x.replaceAll("[^-?0-9]", ""));
            if (value < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            }
        }
        return parseFileToStringList;
    }
}
