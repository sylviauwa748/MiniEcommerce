package service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import payment.PaymentService;

@Service
@Lazy //MEANING "I won't create this bean until someone uses it."
public class AnalysticsService {
    public AnalysticsService() {
        System.out.println("Analystics Created");
    }
    public void generateReport() {
        System.out.println("Analytics Generated");
    }
}
