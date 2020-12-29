package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 737-800", 2012, 39.5, 41140);
        airplane.setYear(2020);
        airplane.setLength(42.5);
        airplane.fillUp(20000);
        airplane.fillUp(26000);
        airplane.info();

    }
}
