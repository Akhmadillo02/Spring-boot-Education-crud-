package uz.najottalim.oquvmarkazcloneapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.oquvmarkazcloneapp.entity.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
