package ucu.edu.ua.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Method to get all students
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // Method to add a new student
    public void addStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findByName(student.getName());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("Name already exists");
        }
        studentRepository.save(student);
    }
}
