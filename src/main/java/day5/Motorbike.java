package day5;

public class Motorbike {
    private int yearOfIssue;
    private String model;
    private String  colour;

    Motorbike(int yearOfIssue, String colour, String model) {
        this.yearOfIssue = yearOfIssue;
        this.colour = colour;
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }
}

