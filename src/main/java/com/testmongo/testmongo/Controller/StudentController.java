package com.testmongo.testmongo.Controller;
import com.testmongo.testmongo.Model.Student;
import com.testmongo.testmongo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/getAllStudent")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") String studentId) {
        return studentService.getStudentById(studentId);
    }
    @GetMapping("/getStudentByName/{name}")
    public Optional<Student> getStudentByName(@PathVariable("name") String name) {
        return studentService.getStudentById(name);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable("id") String studentId, @RequestBody Student student) {
        return studentService.updateStudent(studentId, student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") String studentId) {
        studentService.deleteStudent(studentId);
        return "Student deleted with id " + studentId;
    }
}
