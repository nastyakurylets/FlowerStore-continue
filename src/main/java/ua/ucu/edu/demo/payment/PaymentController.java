package ua.ucu.edu.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;

public class PaymentController {
    private Payment paymentType;

    public PaymentController() {
    }

    public void setPaymentStrategy(Payment paymentType) {
        this.paymentType = paymentType;
    }

    @GetMapping("/payment")
    public String paymentInfo() {
        if (paymentType == null) {
            throw new IllegalStateException("Payment strategy must be set.");
        }
        return paymentType.pay(1000);
    }
}
