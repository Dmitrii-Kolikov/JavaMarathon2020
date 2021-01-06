package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        Warehouse.countDeliveredOrders = 0;
        //вот тут остались вопрос
    }

    @Override
    public void doWork() {
        Warehouse.countDeliveredOrders++;
        salary += 100;
    }

    @Override
    public void bonus() {
        if(Warehouse.countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
       if(isPayed) {
           System.out.println("Бонус уже был выплачен");
           return;
        }
       salary += 50000;
       isPayed =true;

    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("заработная плата: %d, выплачен бонус: %s",
                salary, isPayed);
    }
}
