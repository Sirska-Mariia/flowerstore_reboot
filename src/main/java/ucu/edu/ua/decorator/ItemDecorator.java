package ucu.edu.ua.decorator;
import ucu.edu.ua.flower.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
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
