package day11.task2;

public abstract class Hero {
    private int health;
    private double prphysDef; // (процент поглощения физического урона)
    private double magicDef; // (процент поглощения магического урона)
    private int physAtt; // (величина физической атаки), по необходимости
    private int magicAtt; // (величина магической атаки), по необходимости

    public  abstract int getHealth();

    public abstract double getPrphysDef();

    public abstract double getMagicDef();

    public abstract int getMagicAtt();

    public abstract int getPhysAtt();

    public abstract void setHealth(int v);
}
