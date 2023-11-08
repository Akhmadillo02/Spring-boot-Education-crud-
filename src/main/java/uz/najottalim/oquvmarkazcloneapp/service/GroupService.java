package uz.najottalim.oquvmarkazcloneapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.najottalim.oquvmarkazcloneapp.entity.Group;
import uz.najottalim.oquvmarkazcloneapp.repository.GroupRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;


    public Optional<Group> getById(Long id) {
        Optional<Group> byId = groupRepository.findById(id);
        return byId;
    }


    public List<Group> getAll() {
        List<Group> all = groupRepository.findAll();
        return all;
    }

    public void deleteById(Long id) {
        groupRepository.deleteById(id);
    }

    public Group save(Group group) {
        Group group1 = groupRepository.save(group);
        return group1;
    }

    public Group update(Group group) {
        Group group1 = groupRepository.save(group);
        return group1;
    }
}
