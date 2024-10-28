package ua.ucu.edu.demo.delivery;

import java.util.List;

import lombok.Getter;
import ua.ucu.edu.demo.order.Item;

public class PostDeliveryStrategy implements Delivery{
    @Getter
    private String description;
    public PostDeliveryStrategy(){
        this.description = "Post Delivery";
    }
    public String deliver(List<Item> items) {return "Delivered " + items.size() + " items; " + description;}
}
