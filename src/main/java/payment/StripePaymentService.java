package payment;

import org.springframework.stereotype.Service;

@Service("StripePaymentService")
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Stripe payment");
    }
}
