package day4;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int maxSumNumbersColumn = 0;
        int index = 0;
        Random random = new Random();
        int m = 12;  // ↓ row
        int n = 8;  //  → column
        int[][] massive = new int[m][n];
        for (int i = 0; i < m; i++) {   // ↓
            int sum = 0;
            for(int j = 0; j < n; j++) {   // →
                massive[i][j] = random.nextInt(50);
                sum += massive[i][j];
            }
            System.out.println(sum);
                if(sum >= maxSumNumbersColumn) {
                    maxSumNumbersColumn = sum;
                    index = i;  // ↓ row
            }
        }
        System.out.println(index + " индекс строки, сумма чисел в которой максимальна " + maxSumNumbersColumn);
    }
}
