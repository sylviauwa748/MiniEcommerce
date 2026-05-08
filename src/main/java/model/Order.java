package model;

public class Order {
    private final int orderID;
    private final String orderName;
    private final double price;
    private final int quantity;


    public Order(int orderID, String orderName, double price, int quantity) {
        this.orderID = orderID;
        this.orderName = orderName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Order{id=" + orderID + ", name='" + orderName + "'}";
    }
}
