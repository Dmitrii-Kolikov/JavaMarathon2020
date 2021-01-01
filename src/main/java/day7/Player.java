package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayers = 0;

   public Player(int stamina) {
        this.stamina= stamina;
        countPlayers++;
        if (countPlayers == 7) countPlayers--;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        if(Player.countPlayers == 5)
            System.out.println("Команды неполные. На поле еще есть " + (6 - Player.countPlayers) + " свободное место");
        else if(Player.countPlayers < 5)
            System.out.println("Команды неполные. На поле еще есть " + (6 - Player.countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }



    public void run() {
       if (stamina != 0) {
           stamina--;
           if (stamina == 0) {
               countPlayers--;
           }
       }




    }
}
