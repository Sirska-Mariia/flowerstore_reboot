package ucu.edu.ua.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;

//import jakarta.annotation.PostConstruct;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    
      //  public List <Flower> getFlowers(){
      //          return List.of(new Flower(100,  FlowerType.CHAMOMILE, 100));
      //      
      //  }
    
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
            this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }


    
   // @PostMapping
   // public void addFlower(Flower flower) {
   //     flowerRepository.save(flower); // Save the 
   // }


    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

  // @PostConstruct
  // public void init() {
  //     // Check if the database already has flowers, if not, add some
  //     if (flowerRepository.count() == 0) {
  //       //  flowerRepository.save(new Flower(5, FlowerType.ROSE, 10));
  //       //  flowerRepository.save(new Flower(7, FlowerType.TULIP, 15));
  //         // Add more flowers as needed
  //     }
  // }

   // public void addFlower(Flower flower){
//
   // }
}
