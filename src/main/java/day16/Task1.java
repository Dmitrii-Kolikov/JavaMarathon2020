package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Dmitry\\Desktop\\JavaMarathon\\JavaMarathon2020\\src\\main\\java\\day16\\Numbers");
        Task1.printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        int sum = 0;
        Scanner scanner = new Scanner(file);
        List<Integer> number = new ArrayList<>();
        String n = "";
        while (scanner.hasNextLine()) {
            n = scanner.next();
            number.add(Integer.parseInt(n));
        }
        scanner.close();

        for (Integer x : number) {
            sum += x;
        }
        double average = (double) sum / number.size();
        System.out.print(average + " --> ");
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print(df.format(average));
    }
}

