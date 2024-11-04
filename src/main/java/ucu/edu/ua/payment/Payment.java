package ucu.edu.ua.payment;
import java.util.List;
//import ucu.edu.ua.flower;

import  ucu.edu.ua.flower.*;;

public interface Payment {
    public static final String description = "";

    //public CreditPaymentStrategy 
    double pay(List<Item> items);
    


}



//package flower.store;
//import ua.edu.ucu.apps.flowerstore;
//
//public class Payment {
//
//    private final String descripion;
//
//    //public CreditPaymentStrategy 
//    double pay(List<Item> items);
//
//}
