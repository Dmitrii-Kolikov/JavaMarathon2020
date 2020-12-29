package day6;

public class Car {
    private int yearOfIssue;
    private String  colour;
    private String model;

    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public String getColour() {
        return colour;
    }
    public String getModel() {
        return model;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
    public void yearDifference(int inputYear) {
        int sum = inputYear - yearOfIssue;
        if (sum >= 0) System.out.println("Разницу между переданным годом и годом выпуска транспортного средства " + sum);
    }
}
