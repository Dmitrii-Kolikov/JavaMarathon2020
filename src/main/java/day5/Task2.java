package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike yamaha = new Motorbike(2016, "Black", "R6");
        System.out.println(yamaha.getYearOfIssue());
        System.out.println(yamaha.getColour());
        System.out.println(yamaha.getModel());
    }
}
