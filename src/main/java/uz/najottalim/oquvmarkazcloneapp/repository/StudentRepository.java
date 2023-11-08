package uz.najottalim.oquvmarkazcloneapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.oquvmarkazcloneapp.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
