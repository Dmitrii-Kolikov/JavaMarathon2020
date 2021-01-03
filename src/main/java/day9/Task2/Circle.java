package day9.Task2;

public class Circle extends Figure{
    private int radiusCircle;

    public Circle(int radiusCircle, String color) {
        super(color);
        this.radiusCircle = radiusCircle;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radiusCircle, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radiusCircle;
    }
}
