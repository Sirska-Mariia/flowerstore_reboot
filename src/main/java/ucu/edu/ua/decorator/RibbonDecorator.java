package ucu.edu.ua.decorator;

import ucu.edu.ua.flower.Item;

public class RibbonDecorator extends AbstractDecorator {
    private double ribbonCost = 5.0;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with ribbon";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + ribbonCost;
    }
}
