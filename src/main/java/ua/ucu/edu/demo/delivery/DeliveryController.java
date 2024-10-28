package ua.ucu.edu.demo.delivery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.edu.demo.flower.flower.Flower;

@RestController
public class DeliveryController {
    private Delivery deliveryType;

    public DeliveryController() {
    }

    public void setDeliveryStrategy(Delivery deliveryType) {
        this.deliveryType = deliveryType;
    }

    @GetMapping("/delivery")
    public String deliveryInfo() {
        if (deliveryType == null) {
            throw new IllegalStateException("Delivery strategy must be set.");
        }
        return deliveryType.deliver(List.of(new Flower(), new Flower(), new Flower(), new Flower(), new Flower()));
    }
}
