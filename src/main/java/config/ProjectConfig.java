package config;

import model.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tax.TaxCalculator;

@Configuration
@ComponentScan(basePackages =
        {
                "service",
                "processor",
                "notification",
                "payment",
                "repository",
                "model"
        })
public class ProjectConfig {

    @Bean
    //@Component → Spring controls creation
    //@Bean → You control creation
    // good for external libraries
    public TaxCalculator taxCalculator(){
        Order order = new Order(
                1,
                "Laptop",
                1000,
                2
        );
        return new TaxCalculator(order);

    }
}
