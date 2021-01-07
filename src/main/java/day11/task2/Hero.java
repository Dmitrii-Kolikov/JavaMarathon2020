package day11.task2;

public abstract class Hero implements PhysAttack {
     final static int MAX_HEALTH = 100;
     final static int MIN_HEALTH = 0;
     int health;
     double prphysDef; // (процент поглощения физического урона)
     double magicDef; // (процент поглощения магического урона)
     int physAtt; // (величина физической атаки)

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.prphysDef);
        if(hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
        else hero.health -= attackScore;
    }
}
