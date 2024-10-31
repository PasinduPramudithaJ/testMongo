package com.testmongo.testmongo.Service;
import com.testmongo.testmongo.Model.Student;
import com.testmongo.testmongo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(String studentId) {
        return studentRepo.findById(studentId);
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student updateStudent(String studentId, Student studentDetails) {
        return studentRepo.findById(studentId).map(student -> {
            student.setName(studentDetails.getName());
            student.setAddress(studentDetails.getAddress());
            return studentRepo.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id " + studentId));
    }

    public void deleteStudent(String studentId) {
        studentRepo.deleteById(studentId);
    }
}
