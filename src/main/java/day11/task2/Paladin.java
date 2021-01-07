package day11.task2;

public class Paladin extends Hero implements Healer {
    final static int HEALTH_MISELF = 25;
    final static int HERO_HEALTH = 10;

    Paladin() {
        prphysDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_MISELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else health += HEALTH_MISELF;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (health + HERO_HEALTH > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else hero.health += HERO_HEALTH;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}