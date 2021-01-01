package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(90));
        Player.info();
        player1.run();
        Player player2 = new Player(random.nextInt(9)+ 91);
        Player.info();
        player2.run();
        Player player3 = new Player(random.nextInt(9)+ 91);
        Player.info();
        player3.run();
        Player player4 = new Player(random.nextInt(9)+ 91);
        Player.info();
        player4.run();
        Player player5 = new Player(random.nextInt(9)+ 91);
        Player.info();
        player5.run();
        Player player6 = new Player(random.nextInt(9)+ 91);
        Player.info();
        player6.run();


        }

}
