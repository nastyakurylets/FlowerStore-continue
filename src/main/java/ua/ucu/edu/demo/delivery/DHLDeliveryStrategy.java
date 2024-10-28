package ua.ucu.edu.demo.delivery;

import java.util.List;

import lombok.Getter;
import ua.ucu.edu.demo.order.Item;

public class DHLDeliveryStrategy {
    @Getter
    private String description;
    public DHLDeliveryStrategy(){
        this.description = "DHLDelivery";
    }
    public String deliver(List<Item> items) {return "Delivered " + items.size() + " items; " + description;}
}
