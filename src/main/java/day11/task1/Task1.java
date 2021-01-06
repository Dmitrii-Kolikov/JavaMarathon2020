package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Picker picker1 = new Picker(0, false);
        Courier courier1 = new Courier(0, false);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(new Warehouse().toString());

    }
    static void businessProcess(Worker worker) {
        for(int i =0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }


}
