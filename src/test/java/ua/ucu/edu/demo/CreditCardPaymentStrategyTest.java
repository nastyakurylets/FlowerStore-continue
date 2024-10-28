package ua.ucu.edu.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.ucu.edu.demo.payment.CreditCardPaymentStrategy;

public class CreditCardPaymentStrategyTest {
    @Test
    public void testPay() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = 200.0;
        String expected = "Paid 200.0 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayZeroAmount() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = 0.0;
        String expected = "Paid 0.0 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayLargeAmount() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = 1_000_000.0;
        String expected = "Paid 1000000.0 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPaySmallAmount() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = 0.01;
        String expected = "Paid 0.01 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

}
