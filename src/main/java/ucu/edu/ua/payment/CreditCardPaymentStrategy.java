package ucu.edu.ua.payment;
import java.util.List;

import ucu.edu.ua.flower.Item;

//public class CreditCardPaymentStrategy implements Payment{
//
//    @Override
//    public double pay(List<Item> items){
//        double price = 0;
//        for (Item item: items){
//            price += items.getPrice();
//        }
//        System.out.println("Paid with Credit Card " + price);
//        return price;
//    }
//}
//
//


import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment {
    public String name;
    public String description;

    @Override 
    public double pay(List<Item> items){
        double price = 0;
        for (Item item: items){
            price += item.getPrice();

       // System.out.println("Paf with credic card" + price);
        }
        System.out.println("Paid with Credit Card " + price);
        return price;

    }



}
