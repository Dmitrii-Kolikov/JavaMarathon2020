package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Dmitry\\Desktop\\JavaMarathon\\file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        Random random = new Random();

        for(int i = 0; i < 1000; i++) {
            pw1.print(random.nextInt(100) + " ");
        }
        pw1.close();

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(file1);

        while (scanner.hasNextInt()) {
            numbers.add(Integer.parseInt(scanner.next()));
        }
        scanner.close();

        File file2 = new File("C:\\Users\\Dmitry\\Desktop\\JavaMarathon\\file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);

        int sum = 0;
        double average = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if ((i + 1 ) % 20 == 0) {
                average = (double) sum / (i + 1);
                pw2.print(average + " ");
                sum = 0;
            }
        }
        pw2.close();
        Task2.printResult(file2);
    }
    public static void printResult(File file2) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file2).useLocale(Locale.US);
        //Используйте локаль US, тогда в формате ввода числа можно вместо запятой указывать точку:
        double sumFile2 = 0;
        while (scanner2.hasNextDouble()) {
            sumFile2 += Double.parseDouble(scanner2.next());
        }
        scanner2.close();

        System.out.println((int) sumFile2);

    }

}
