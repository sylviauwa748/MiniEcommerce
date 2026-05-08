package notification;

import model.Order;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void SendNotification(Order order) {
        System.out.println("Order has been sent to " + order.getOrderID() +" " + "VIA Email");
    }
}
