package day5;

public class Task1 {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.setYearOfIssue(2019);
        honda.setModel("CR-V");
        honda.setColour("White");
        System.out.println(honda.getYearOfIssue());
        System.out.println(honda.getModel());
        System.out.println(honda.getColour());

    }
}

