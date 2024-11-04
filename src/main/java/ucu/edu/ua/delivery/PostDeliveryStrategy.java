package ucu.edu.ua.delivery;

import java.util.List;

import ucu.edu.ua.flower.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivered items via Post");
    }
}
