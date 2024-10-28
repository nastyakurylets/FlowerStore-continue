package ua.ucu.edu.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    public String pay(double price) {
        return "Paid " + price + " with credit card";
    }
}
