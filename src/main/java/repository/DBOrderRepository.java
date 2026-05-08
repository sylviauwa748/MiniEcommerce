package repository;

import model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class DBOrderRepository implements OrderRepository {

    @Override
    public Order save(Order order) {
        System.out.println("OrderRepository save");
        return order;
    }
}
