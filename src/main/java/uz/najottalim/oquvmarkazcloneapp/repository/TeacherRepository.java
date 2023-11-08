package uz.najottalim.oquvmarkazcloneapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.oquvmarkazcloneapp.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
