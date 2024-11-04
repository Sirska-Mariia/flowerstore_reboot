package ucu.edu.ua.payment;

import java.util.List;
import ucu.edu.ua.flower.Item;
import lombok.Getter;

@Getter
public class PayPalPaymentStrategy implements Payment {
    public String name;
    public String description;

    @Override 
    public double pay(List<Item> items){
        double price = 0;
        for (Item item: items){
            price += item.getPrice();

       // System.out.println("Paf with credic card" + price);
        }
        System.out.println("Paid with Pay Pal " + price);
        return price;

    }



}
