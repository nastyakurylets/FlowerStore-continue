package ua.ucu.edu.demo.order;

import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.demo.delivery.Delivery;
import ua.ucu.edu.demo.payment.Payment;

import java.util.List;

@Getter @Setter
public class Order {
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order(List<Item> items) {
        this.items = items;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double total = items.stream()
                    .mapToDouble(Item::getPrice)
                    .sum();
        return total;
    }

    public String processOrder() {
        if (payment == null || delivery == null) {
            throw new IllegalStateException("Payment and delivery strategies must be set before processing the order.");
        }
        double totalPrice = calculateTotalPrice();
        String paymentResult = payment.pay(totalPrice);
        String deliveryResult = delivery.deliver(items);
        return deliveryResult + "\n" + paymentResult;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}

