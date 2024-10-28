package ua.ucu.edu.demo.flower.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlowerController {
    @GetMapping("/flowers")
    public static List<Flower> getFlowerList() {
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();
        Flower flower4 = new Flower();
        Flower flower5 = new Flower();
        
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setColor(FlowerColor.RED);
        flower2.setFlowerType(FlowerType.CHAMOMILE);
        flower2.setColor(FlowerColor.BLUE);
        flower3.setFlowerType(FlowerType.TULIP);
        flower3.setColor(FlowerColor.RED);
        flower4.setFlowerType(FlowerType.CHAMOMILE);
        flower4.setColor(FlowerColor.BLUE);
        flower5.setFlowerType(FlowerType.CHAMOMILE);
        flower5.setColor(FlowerColor.RED);
        
        return List.of(flower1, flower2, flower3, flower4, flower5);
    }
    
}
