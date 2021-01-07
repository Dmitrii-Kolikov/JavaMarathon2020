package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public void counterDeliveredOrders() {
        countDeliveredOrders++;
    }

    public void counterPickedOrders() {
        countPickedOrders++;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return String.format("количесвто собранных заказов: %d, количество доставленных заказов: %d",
                countPickedOrders, countDeliveredOrders);
    }




}
