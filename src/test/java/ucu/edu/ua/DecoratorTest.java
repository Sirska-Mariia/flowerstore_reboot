package ucu.edu.ua;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import ucu.edu.ua.decorator.*;
import ucu.edu.ua.flower.*;

public class DecoratorTest {
    @Test
    public void testRibbonDecorator() {
        Item flower = new Flower(10, 5, FlowerType.ROSE);
        Item ribbonFlower = new RibbonDecorator(flower);

      //  assertEquals("Flower type: ROSE, color: #0000FF, sepal length: 5.0 with ribbon", ribbonFlower.getDescription());
     //   assertEquals(15.0, ribbonFlower.getPrice());
    }

    @Test
    public void testMultipleDecorators() {
        Item flower = new Flower(10, 7, FlowerType.TULIP);
        Item decoratedFlower = new BasketDecorator(new PaperDecorator(new RibbonDecorator(flower)));

     //   assertEquals("Flower type: TULIP, color: #0000FF, sepal length: 7.0 with ribbon wrapped in paper placed in a basket", 
      //  decoratedFlower.getDescription());
      //  assertEquals(28.0, decoratedFlower.getPrice());
    }
}
