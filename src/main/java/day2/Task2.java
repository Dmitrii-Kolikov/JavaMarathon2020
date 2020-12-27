package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() + 1;  //one number
        int b = scanner.nextInt();      //two number
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for(int i = a; i < b; i++) {  // between a and b,  int a and int b ignore
             if(i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
