package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);

    }
    public void fillUp(int n) {
      fuel += n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {

        if (airplane1.length > airplane2.length)
        System.out.println("Первый самолет длиннее");

        else if(airplane1.length < airplane2.length)
            System.out.println("Второй самолет длиннее");

        else
            System.out.println("Длины самолетов равны");
        }

    @Override
    public String toString() {
        return String.format("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d",
                producer, year, length, weight, fuel);
       // return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}

