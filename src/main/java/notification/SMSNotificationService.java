package notification;

import model.Order;
import org.springframework.stereotype.Service;

@Service("SMSNotification")
public class SMSNotificationService implements NotificationService {

    @Override
    public void SendNotification(Order order) {
        System.out.println("Order has been sent to " + order.getOrderID() + " " + "VIA SMS");
    }
}
