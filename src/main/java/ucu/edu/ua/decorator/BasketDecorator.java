package ucu.edu.ua.decorator;
import ucu.edu.ua.flower.Item;

public class BasketDecorator extends AbstractDecorator {
    private double basketCost = 10.0;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " placed in a basket";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + basketCost;
    }
}
