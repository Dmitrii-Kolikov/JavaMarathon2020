package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int max=0;
        int index = 0;
        int sum = 0;
        Random random = new Random();
        int[] massive = new int[100];
        for(int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(10000);
            if(i < 98 && massive[i] > max) {
                max = massive[i];
                index = i;
            }
        }
        sum =  massive[index] + massive[index + 1] + massive[index + 2];
        System.out.println(Arrays.toString(massive));
        System.out.println(index);
        System.out.println(sum);
    }
}
