package uz.najottalim.oquvmarkazcloneapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najottalim.oquvmarkazcloneapp.entity.Student;
import uz.najottalim.oquvmarkazcloneapp.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;


    public Optional<Student> getById(Long id) {
        Optional<Student> byId = studentRepository.findById(id);
        return byId;
    }


    public List<Student> getAll() {
        List<Student> all = studentRepository.findAll();
        return all;
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);

    }


    public Student update(Student student) {
        return studentRepository.save(student);
    }

}
