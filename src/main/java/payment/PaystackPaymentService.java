package payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("PaystackPaymentService")
public class PaystackPaymentService implements PaymentService {

    @Override
    public void processPayment() {
        System.out.println("Paystack Payment");
    }
}
