package processor;

import model.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring injects the dependency ONLY ONCE during creation of OrderService.
//Even though OrderProcessor is prototype:
//you still end up with one processor object
//inside the singleton service.
//That destroys prototype behavior. Applicationcontext fixes this


@Component
@Scope("prototype")
//We want a new instance created whenever we process an order.
public class DefaultOrderProcessor implements OrderProcessor {
//needs a mutable field
    private String currentOrder;

    public DefaultOrderProcessor() {
        System.out.println("NEW OrderProcessor created: " + this);
    }

    @Override
    public void processOrder(String order) {
        this.currentOrder = order;
        System.out.println("Processing order: " + currentOrder);
    }

}
