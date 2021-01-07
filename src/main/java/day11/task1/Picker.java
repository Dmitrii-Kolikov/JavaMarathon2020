package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        warehouse.counterPickedOrders();
        salary += 80;
    }

    @Override
    public void bonus() {
        if(warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed =true;

    }

    @Override
    public String toString() {
        return String.format("заработная плата: %d, выплачен бонус: %s",
                salary, isPayed);
    }
}

