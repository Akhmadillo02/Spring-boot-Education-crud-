package uz.najottalim.oquvmarkazcloneapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.oquvmarkazcloneapp.entity.Student;
import uz.najottalim.oquvmarkazcloneapp.entity.Teacher;
import uz.najottalim.oquvmarkazcloneapp.service.StudentService;
import uz.najottalim.oquvmarkazcloneapp.service.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherRestController {

    private final TeacherService teacherService;

    @GetMapping("/{id]")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Teacher> byId = teacherService.getById(id);
        return ResponseEntity.ok(byId);
    }


    @GetMapping("/findAll")
    public List<Teacher> findAll() {
        List<Teacher> all = teacherService.getAll();
        return all;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        teacherService.deleteById(id);
        return ResponseEntity.ok("delete Teacher" + id);
    }

    @PostMapping("/save")
    public Teacher save(@RequestBody Teacher teacher) {
        Teacher teacher1 = teacherService.save(teacher);
        return teacher1;

    }

    @PutMapping("/update")
    public Teacher update(@RequestBody Teacher teacher) {
        Teacher updateTeacher = teacherService.update(teacher);
        return updateTeacher;
    }
}
