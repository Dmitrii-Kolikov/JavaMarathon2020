package day12.task5;

public class MusicArtist {
    private String name;  //имя музыканта
    private int age;   //возраст музыканта

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("\n Название музыкальной группы: %s, год основания: %d", name, age);
    }
}

