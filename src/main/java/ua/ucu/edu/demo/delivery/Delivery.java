package ua.ucu.edu.demo.delivery;

import java.util.List;
import ua.ucu.edu.demo.order.Item;

public interface Delivery {
    public String deliver(List<Item> items);
}
