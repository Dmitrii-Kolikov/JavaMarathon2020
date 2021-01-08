package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("tenNumbers");
        Task1.printSumDigits(file);
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
          int counter = 0;
          int sum = 0;
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] numbersString = line.split(" ");

        int[] numbers = new int[10];

        try {
            for (String num : numbersString) {
                numbers[counter++] = Integer.parseInt(num);
            }
            for(int num: numbers) {
                sum += num;
            }
            System.out.println(sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }

        scanner.close();
    }
}

