package uz.najottalim.oquvmarkazcloneapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.najottalim.oquvmarkazcloneapp.entity.Teacher;
import uz.najottalim.oquvmarkazcloneapp.repository.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherService {


    private final TeacherRepository teacherRepository;

    public Optional<Teacher> getById(Long id) {
        Optional<Teacher> byId = teacherRepository.findById(id);
        return byId;
    }


    public List<Teacher> getAll() {
        List<Teacher> all = teacherRepository.findAll();
        return all;
    }

    public void deleteById(Long id) {
        teacherRepository.deleteById(id);
    }

    public Teacher save(Teacher teacher) {
        Teacher teacher1 = teacherRepository.save(teacher);
        return teacher1;
    }

    public Teacher update(Teacher teacher) {
        Teacher update = teacherRepository.save(teacher);
        return update;
    }
}
