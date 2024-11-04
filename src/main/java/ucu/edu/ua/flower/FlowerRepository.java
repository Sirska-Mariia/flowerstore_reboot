package ucu.edu.ua.flower;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long>{

//    List<Flower> findAll();
 
}

