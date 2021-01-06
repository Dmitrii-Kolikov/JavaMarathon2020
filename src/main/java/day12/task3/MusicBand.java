package day12.task3;

public class MusicBand {
    private String name;  //название музыкальной группы
    private int year;   //год основания

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("\n Название музыкальной группы: %s, год основания: %d", name, year);
    }
}
