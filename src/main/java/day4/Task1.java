package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int counterMore8 = 0;
        int counterEquals1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sumNumbers = 0;

        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sizeMassive = scanner.nextInt();
        int[] massive = new int[sizeMassive];
        for (int i =0; i < massive.length; i++) {
            massive[i] =random.nextInt(10);
            sumNumbers += massive[i];
            if(massive[i] > 8) {
                counterMore8++;
            }
            if(massive[i] == 1) {
                counterEquals1++;
            }
            if(massive[i] % 2 == 0) {
                evenNumbers++;
            }
            if(massive[i] % 2 == 1) {
                oddNumbers++;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Длина массива: " + massive.length);
        System.out.println("Количество чисел больше 8: " + counterMore8);
        System.out.println("Количество чисел равных 1: " + counterEquals1);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sumNumbers);

    }
}
