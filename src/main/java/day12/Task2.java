package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            if (i < 30 && i % 2 == 0) {
                evenNumbers.add(i);
                System.out.print(i + " ");
            }
            else if (i >= 300 && i % 2 == 0) {
                evenNumbers.add(i);
                System.out.print(i + " ");
            }
        }
    }
}
