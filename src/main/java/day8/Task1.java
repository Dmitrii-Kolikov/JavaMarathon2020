package day8;

public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String string = "";
        for(int i =0; i < 20000; i ++) {
           string = string + i + " ";
        }
        System.out.println(string);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis1);

        System.out.println();

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i < 20000; i ++) {
          sb.append(i).append(" ");  //for me
        }
        System.out.println(sb);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }
}    //String 1059 ms     StringBuilder 79 ms
