package ucu.edu.ua.flower;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public double getPrice() {
       return flower.getPrice() * quantity;
    }
    public static void main(String[] args) {
    
    }

}


