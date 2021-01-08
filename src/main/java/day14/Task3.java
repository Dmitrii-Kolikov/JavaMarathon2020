package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.txt");
        System.out.println(Task3.parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file)  {
        List<Person> parseFileToStringList = new ArrayList<>();
        List<String> name = new ArrayList<>();
        int value;
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            name.add(scanner.nextLine());
        }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for(String x:name) {
            parseFileToStringList.add(new Person(x.replaceAll("[^a-zA-Z]", ""),
                    value = Integer.parseInt(x.replaceAll("[^-?0-9]", "" ))));
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
