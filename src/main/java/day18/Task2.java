package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237)); // 5
    }
    public static int count7(int n) {
        if (n % 10 == 7 || n == 7) {
            return 1 + count7(n / 10);
        }
        else if (n < 10) {
            return 0;
        }
        else {
            return count7(n / 10);
        }
    }
}
