package ua.ucu.edu.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ua.ucu.edu.demo.delivery.DHLDeliveryStrategy;
import ua.ucu.edu.demo.flower.flower.Flower;
import ua.ucu.edu.demo.order.Item;

public class DHLDeliveryStrategyTest {
    @Test
    public void testDeliverWithFlowers() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        items.add(flower1);
        items.add(flower2);

        String result = delivery.deliver(items);
        assertEquals("Delivered 2 items; By DHL Delivery", result);
    }

    @Test
    public void testDeliverWithEmptyList() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        String result = delivery.deliver(items);
        assertEquals("Delivered 0 items; By DHL Delivery", result);
    }
}
