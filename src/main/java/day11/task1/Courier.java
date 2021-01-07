package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return  salary;
    }

    @Override
    public void doWork() {
        warehouse.counterDeliveredOrders();
        salary += 100;
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() < 10000) {
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

    @Override
    public String toString() {
        return String.format("заработная плата: %d, выплачен бонус: %s",
                salary, isPayed);
    }
}
