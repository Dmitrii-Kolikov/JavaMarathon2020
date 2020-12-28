package day4;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int max=0;
        int index = 0;
        int sumMaxThreeNumbers = 0;
        Random random = new Random();
        int[] massive = new int[100];
        for(int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(10000);
            }
        for (int i = 0; i <massive.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += massive[j];
                if (sum > sumMaxThreeNumbers) {
                    sumMaxThreeNumbers = sum;
                    index = i;
                }
            }
        }
        System.out.println("индекс первого элемента тройки: " + index);
        System.out.println("Значение тройки с максимальной суммой: " + sumMaxThreeNumbers);
        }
    }

