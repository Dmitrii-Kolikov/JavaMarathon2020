package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 737-800", 2012, 395, 41140);
        Airplane airplane2 = new Airplane("Boeing 747", 2013, 705, 170404);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}