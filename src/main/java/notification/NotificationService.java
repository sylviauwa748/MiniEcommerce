package notification;

import model.Order;

public interface NotificationService {

    void SendNotification(Order order);

}
