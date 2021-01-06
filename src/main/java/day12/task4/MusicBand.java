package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;  //название музыкальной группы
    private int year;   //год основания
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.members.addAll(musicBand1.members);
        musicBand1.getMembers().removeAll(musicBand1.members);
    }

    public void printMembers() {
        System.out.println(getMembers());
    }


    public List<String> getMembers() {
        return members;
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
