package day11.task1;

public class Warehouse {
    public static  int countPickedOrders;
    public static int countDeliveredOrders;

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
