import config.ProjectConfig;
import model.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.AnalysticsService;
import service.OrderService;
import tax.TaxCalculator;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the main app!");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(new Order(1, "Laptop", 200, 3));
        orderService.placeOrder(new Order(2, "Phone", 400, 2));

        System.out.println("-----------------------");
        System.out.println("-----------------------");
        TaxCalculator taxCalculator = context.getBean(TaxCalculator.class);
        System.out.println("Tax Calculator: " + taxCalculator);
        System.out.println("All Orders Complete!");


        System.out.println("-----------------------");
        System.out.println("-----------------------");
        AnalysticsService analysticsService = context.getBean(AnalysticsService.class);
        analysticsService.generateReport();
    }
}
