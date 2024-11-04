package ucu.edu.ua.flower;

//import org.hibernate.annotations.Table;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;
//import org.springframework.stereotype.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
//public class Flower {
//
//    public Flower(int i, String chamomile, int price) {
//       
//    }
//
//}
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

///@SuppressWarnings("removal")
@AllArgsConstructor @Getter @Setter
@Entity
@Table
//(name = "flower")
public class Flower extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType type;
    //@Getter
    //private FlowerColor flowerColor;


    @Override
    public String getDescription() {
        return "Flower type: " + type + ", color: " + color + ", sepal length: " + sepalLength;
    }


    public String getColor() {
        return color.toString();
    }
//
    public Flower(int price, int sepalLength, FlowerType flowerType){ //int price) {
        this.sepalLength =  sepalLength;
        this.type = flowerType;
        this.price = price;
       // FlowerColor  red =  setFlowerColor("red");
        this.color = FlowerColor.BLUE;
        //this.color = FlowerColor();
     
    }
    public Flower() {
        // No-argument constructor
    }
    


   // private FlowerColor setFlowerColor(String string) {
   //     this.color = FlowerColor.BLUE;
   //     
   //     //throw new UnsupportedOperationException("Unimplemented method 'setFlowerColor'");
   // }
}



//ackage ucu.edu.ua.flower;
//
//mport jakarta.persistence.Entity;
//mport jakarta.persistence.GeneratedValue;
//mport jakarta.persistence.GenerationType;
//mport jakarta.persistence.Id;
//
//Entity
//ublic class Flower {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
//   private Long id;
//
//   private String name;
//   private String color;
//   private double price;
//
//   // Getters and Setters
//   public Long getId() {
//       return id;
//   }
//
//   public void setId(Long id) {
//       this.id = id;
//   }
//
//   public String getName() {
//       return name;
//   }
//
//   public void setName(String name) {
//       this.name = name;
//   }
//
//   public String getColor() {
//       return color;
//   }
//
//   public void setColor(String color) {
//       this.color = color;
//   }
//
//   public double getPrice() {
//       return price;
//   }
//
//   public void setPrice(double price) {
//       this.price = price;
//   }
//
//