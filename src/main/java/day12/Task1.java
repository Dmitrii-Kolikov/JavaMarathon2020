package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> modelAuto = new ArrayList<>(Arrays.asList("BMV", "Audi", "Toyota", "Renault", "Honda"));
        for(String x: modelAuto) {
            System.out.print(x + " ");
        }
        System.out.println();

        modelAuto.add(3,"Ford");
        modelAuto.remove(1);
        for(String x: modelAuto) {
            System.out.print(x + " ");
        }
    }
}
