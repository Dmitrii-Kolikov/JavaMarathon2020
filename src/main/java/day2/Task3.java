package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() + 1;  //1 number
        int b = scanner.nextInt();  //2 number
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (a < b) {  // between a and b,  int a and int b ignore
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
