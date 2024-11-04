package ucu.edu.ua.decorator;
import ucu.edu.ua.flower.Item;

public abstract class AbstractDecorator extends Item {
    protected Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
}
