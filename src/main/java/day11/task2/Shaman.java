package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private  int health = 100; // (здоровье)
    private  double prphysDef = 20.0; // (процент поглощения физического урона)
    private  double magicDef = 20.0; // (процент поглощения магического урона)
    private  int physAtt = 10; // (величина физической атаки), по необходимости
    private  int magicAtt = 15; // (величина магической атаки), по необходимости

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public double getPrphysDef() {
        return prphysDef;
    }

    @Override
    public double getMagicDef() {
        return magicDef;
    }

    @Override
    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public int getPhysAtt() {
        return physAtt;
    }

    @Override
    public void setHealth(int v) {
        if (v > 100) {
            this.health = 100;
        }
        else if (v < 0) {
            this.health = 0;
        }
        else this.health = v;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - (physAtt - physAtt * hero.getPrphysDef() / 100) ) );
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef() / 100) ) );
    }

    @Override
    public void healHimself() {
        setHealth(health + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
    }
}
