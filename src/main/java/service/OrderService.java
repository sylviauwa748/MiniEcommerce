package service;

import model.Order;
import notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import payment.PaymentService;
import processor.OrderProcessor;
import repository.OrderRepository;

@Service
public class OrderService {
    private final NotificationService notificationService;
    private final OrderRepository orderRepository;
    private final PaymentService paymentService;
    private final ApplicationContext applicationContext;

    //order service depends on notification service
    //meaning “Spring, inject a NotificationService bean here.”
    //in doing that finds out there are two implementations now stuck
    //1 way @Qualifier and 2nd  @primary
    @Autowired
    public OrderService(
            @Qualifier("SMSNotification")
            NotificationService notificationService,
            OrderRepository orderRepository,
            @Qualifier("StripePaymentService")
            PaymentService paymentService,

            ApplicationContext applicationContext) {

        System.out.println("OrderService created: " + this);

        this.notificationService = notificationService;
        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
        this.applicationContext = applicationContext;
    }

    public void placeOrder(Order order) {
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("Order placed: " + this);

        OrderProcessor orderProcessor = applicationContext.getBean(OrderProcessor.class);

        orderProcessor.processOrder(order.toString());

        paymentService.processPayment();
        notificationService.SendNotification(order);
        orderRepository.save(order);

        System.out.println("Order Complete: " + this);
    }
}
