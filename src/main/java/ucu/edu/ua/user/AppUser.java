package ucu.edu.ua.user;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private LocalDate dob;

    @Transient
    private int age;

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
