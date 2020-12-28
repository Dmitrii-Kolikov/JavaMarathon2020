package day4;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int counterHave0InTheEnd = 0;
        int sumCounterHave0InTheEnd = 0;
        int maxNumberMassive = 0;
        int minNumberMassive = 10000;
        Random random = new Random();
        int[] massive = new int[100];
        for(int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(10000 );
        }
        for(int x: massive) {
            if(x % 10 == 0) {
                sumCounterHave0InTheEnd += x;
                counterHave0InTheEnd++;
            }
            if (x > maxNumberMassive) {
                maxNumberMassive = x;
            }
            if (x < minNumberMassive) {
                minNumberMassive = x;
            }
        }
        System.out.println("Наибольший элемент массива: " + maxNumberMassive);
        System.out.println("Наименьший  элемент массива: " + minNumberMassive);
        System.out.println("Количество элементов массива, оканчивающихся на 0 : " + counterHave0InTheEnd);
        System.out.println("Сумма элементов массива, оканчивающихся на 0 : " + sumCounterHave0InTheEnd);

    }
}
