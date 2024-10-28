package ua.ucu.edu.demo;

import org.junit.jupiter.api.Test;

import ua.ucu.edu.demo.payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

public class PayPalPaymentStrategyTest {
    
    @Test
    public void testPay() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = 100.0;
        String expected = "Paid 100.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayZeroAmount() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = 0.0;
        String expected = "Paid 0.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayNegativeAmount() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = -50.0;
        String expected = "Paid -50.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayLargeAmount() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = 1_000_000.0;
        String expected = "Paid 1000000.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPaySmallAmount() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = 0.01;
        String expected = "Paid 0.01 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }
}
