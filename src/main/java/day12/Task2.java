package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        for (int i = 300; i < 500; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        for (Integer x: evenNumbers) {
            System.out.print(x + " ");
        }

    }
}
