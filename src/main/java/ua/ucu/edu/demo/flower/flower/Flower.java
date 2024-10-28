package ua.ucu.edu.demo.flower.flower;

import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.demo.order.Item;



@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private FlowerType flowerType;

    
    public Flower() {
    }

    public Flower(double sepalLength, FlowerColor color, double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.flowerType = flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
