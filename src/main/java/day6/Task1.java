package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike yamaha = new Motorbike(2016, "Black", "R6");
        yamaha.info();
        yamaha.yearDifference(2020);

        Car honda = new Car();
        honda.setYearOfIssue(2000);
        honda.setModel("CR-V");
        honda.setColour("White");
        honda.info();
        honda.yearDifference(2020);



    }
}
