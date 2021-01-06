package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        Warehouse.countPickedOrders = 0;
        //вот тут остались вопрос
    }

    @Override
    public void doWork() {
        Warehouse.countPickedOrders++;
        salary += 80;
    }

    @Override
    public void bonus() {
        if(Warehouse.countPickedOrders < 10000) {
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

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("заработная плата: %d, выплачен бонус: %s",
                salary, isPayed);
    }
}

