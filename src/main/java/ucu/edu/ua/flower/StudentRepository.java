package ucu.edu.ua.flower;

import java.util.Optional;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    @Query("SELECT s FROM Student s WHERE s.name = ?1")
    Optional<Student> findByName(String name);

//    List<Flower> findAll();
 
}

