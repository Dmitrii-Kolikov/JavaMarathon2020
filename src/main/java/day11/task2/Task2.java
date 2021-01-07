package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin); //Воин атакует Паладина +
        System.out.println(paladin);

        paladin.physicalAttack(magician);  //Паладин атакует Мага +
        System.out.println(magician);

        shaman.healTeammate(magician);  //Шаман лечит Мага +
        System.out.println(magician);

        magician.magicalAttack(paladin); //Маг атакует Паладина, тип атаки М +
        System.out.println(paladin);

        shaman.physicalAttack(warrior);  //Шаман атакует Воина, тип атаки Ф +
        System.out.println(warrior);

        paladin.healHimself(); //Паладин лечит себя
        System.out.println(paladin);

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);   //Воин атакует Мага 5 раз
            System.out.println(magician);
        }
    }
}
