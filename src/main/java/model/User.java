package model;

public class User {
    private final int userID;
    private String userName;
    private final Order order;

    public User(int userID, String userName, Order order) {
        this.userID = userID;
        this.userName = userName;
        this.order = order;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Order getOrder() {
        return order;
    }
}
