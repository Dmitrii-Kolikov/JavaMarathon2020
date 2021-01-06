package day11.task1;

public class Courier implements Worker {
    private int salary;
    private Boolean isPayed;
    Warehouse warehouse;

    public Courier(int salary, Boolean isPayed) {
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
        }
       else if(Warehouse.countDeliveredOrders == 10000) {
            salary += 50000;
            isPayed = true;
            Warehouse.countDeliveredOrders++;
        }
        else  System.out.println("Бонус уже был выплачен");
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
