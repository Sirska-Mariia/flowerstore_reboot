package ucu.edu.ua.flower;

import java.util.ArrayList;
//import java.util;
import java.util.*;
//import java.util.List;

import ucu.edu.ua.delivery.Delivery;
import ucu.edu.ua.payment.Payment;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public void setPaymentStrategy(Payment payment) {
        this.paymentStrategy = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.deliveryStrategy = delivery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
