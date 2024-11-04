package ucu.edu.ua.decorator;
import ucu.edu.ua.flower.Item;

public class PaperDecorator extends AbstractDecorator {
    private double paperCost = 3.0;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " wrapped in paper";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + paperCost;
    }
}
