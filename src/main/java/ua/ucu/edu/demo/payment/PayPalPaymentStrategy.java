package ua.ucu.edu.demo.payment;

public class PayPalPaymentStrategy implements Payment{
    public String pay(double price) {
        return "Paid " + price + " with PayPal";
    }
}
