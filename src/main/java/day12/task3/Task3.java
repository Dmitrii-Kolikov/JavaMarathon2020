package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Big Country", 1981));
        musicBands.add(new MusicBand("Alice in Chains", 1987));
        musicBands.add(new MusicBand("Brick & Lace", 2004));
        musicBands.add(new MusicBand("The Walkabouts", 1984));
        musicBands.add(new MusicBand("Plaid", 1991));
        musicBands.add(new MusicBand("Escape the Fate", 2004));
        musicBands.add(new MusicBand("Disappeared Completely", 2016));
        musicBands.add(new MusicBand("Jus2", 2019));
        musicBands.add(new MusicBand("Five Hand Reel", 1974));
        musicBands.add(new MusicBand("Clean Bandit", 2009));

        Collections.shuffle(musicBands);
        for(MusicBand x: musicBands) {
            System.out.print(x.getName() + " " + x.getYear() + " ");
        }
        System.out.println();
        System.out.println(groupsAfter2000(musicBands));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand x: musicBands) {
            if (x.getYear() > 2000) {
              groupsAfter2000.add(x);
            }
        }
            return groupsAfter2000;
    }
}
