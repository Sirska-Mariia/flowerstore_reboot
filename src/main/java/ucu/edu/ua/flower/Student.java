package ucu.edu.ua.flower;

import java.time.LocalDate;
import java.time.Period;

//import java.beans.Transient;

//import java.beans.Transient;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@EntityScan
//@Table
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    String name;
    String gender;
    @Transient
    private int age;
   //public Student(int age) {
   //    this.age = age;
   //}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    @Column(nullable = false)
    private LocalDate dob;

    public Student() {}

    public Student(String name, String gender, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

  //  public int getAge(int age){
  //      return age;
  //  }
//
  //  public int setAge(int age){
  //      this.age = age;
  //  }

    //getAge

    // setAge

    // LOCAL DATE, DATE OF BIRTH;

}

//Student controller:
//  @RestController
// get students()
// add students()



//StudentService:
// getstudents()
// add student()


// Student 



// interface not class
// @Repository
// @StudentRepository
/// Student Repositoryextends JPA repository <Student long>
// @Query("Select...")
//  @Query("SELECT u FROM app_user u WHERE u.email = ?1")
//  Optional(Student)    find_By_first_name(String name);
// Optional(Student)

//
