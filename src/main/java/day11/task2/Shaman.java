package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    final static int HEALTH_MISELF = 50;
    final static int HERO_HEALTH = 30;
    int magicAtt = 15; // (величина магической атаки)

    Shaman() {
        prphysDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackMagic = magicAtt * (1 - hero.magicDef);
        if(hero.health - attackMagic < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
        else hero.health -= attackMagic;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_MISELF > MAX_HEALTH ) {
            health = MAX_HEALTH;
        }
        else health += HEALTH_MISELF;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (health + HERO_HEALTH > MAX_HEALTH ) {
            hero.health = MAX_HEALTH;
        }
        else hero.health += HERO_HEALTH;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
