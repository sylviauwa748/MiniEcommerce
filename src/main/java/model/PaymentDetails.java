package model;

public class PaymentDetails {
    private final double amount;
    private final Order order;
    private final User user;

    public PaymentDetails(double amount, Order order, User user) {
        this.amount = amount;
        this.order = order;
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public Order getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }
}
