package ucu.edu.ua.flower;
//
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;
//@RestController
//public class FlowerController {
//    @GetMapping
//    public List<Flower> helloWorld() { //String getMethodName(@RequestParam String param) {
//       // int price;
//        //int sepallength;
//        return List.of(new Flower(100, FlowerType.Chamomile, 100));  
//    }
//}

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ModelAttribute;

@RestController
@RequestMapping("/flower")
//@RequestMapping(path = "Flower") 
public class FlowerController {
    private final FlowerService flowerService;


    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
   // @GetMapping
   // public List<Flower> getFlowers(){
   //     return flowerService.getFlowers();
   // }

  // @GetMapping
  // public List<Flower> getFlowers() {
  //     return flowerService.getFlowers(); // This should return List<Flower>
  // }
//
   @GetMapping
    public List<Flower> getFlowers() {
       // List<Flower> flowers = flowerService.getFlowers();
       // return ResponseEntity.ok(flowers);
       return flowerService.getFlowers();
    }

  //@PostMapping
  //  public Flower addFlower(@RequestBody Flower flower) {
  //      return flowerService.addFlower(flower);
  //  }
      
  @PostMapping
  public ResponseEntity<Flower> addFlower(@RequestBody Flower flower) {
      return ResponseEntity.ok(flowerService.addFlower(flower));
}


  

   // @PostMapping
   // public void addFlower(Flower flower) {
   //     flowerRepository.save(flower); // Save the flower to the database
   // }
//

    
   // public String hello() {
   //     return "hello new1";
   // }
}

//@RestController
//@RequestMapping("/api/flowers")
//public class FlowerController {
//
//    private final FlowerService flowerService;
//
//    @Autowired
//    public FlowerController(FlowerService flowerService) {
//        this.flowerService = flowerService;
//    }
//
//    // GET endpoint to retrieve all flowers
//    @GetMapping
//    public ResponseEntity<List<Flower>> getAllFlowers() {
//        List<Flower> flowers = flowerService.getFlowers();
//        return ResponseEntity.ok(flowers);
//    }
//
//    // POST endpoint to add a new flower
//    @PostMapping
//    public ResponseEntity<Flower> addFlower(@RequestBody Flower flower) {
//        Flower savedFlower = flowerService.addFlower(flower);
//        return ResponseEntity.ok(savedFlower);
//    }
//}
//