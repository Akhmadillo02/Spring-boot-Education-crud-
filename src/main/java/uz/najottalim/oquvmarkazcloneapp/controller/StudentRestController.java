package uz.najottalim.oquvmarkazcloneapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.oquvmarkazcloneapp.entity.Student;
import uz.najottalim.oquvmarkazcloneapp.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentRestController {

    private final StudentService studentService;

    @GetMapping("/{id]")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Student> byId = studentService.getById(id);
        return ResponseEntity.ok(byId);
    }


    @GetMapping("/findAll")
    public List<Student> findAll() {
        List<Student> all = studentService.getAll();
        return all;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        studentService.deleteById(id);
        return ResponseEntity.ok("delete student" + id);
    }

    @PostMapping("/save")
    public Student save(@RequestBody Student student) {
        Student student1 = studentService.save(student);
        return student1;

    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student) {
        Student updateStudent = studentService.update(student);
        return updateStudent;

    }
}
