package uz.najottalim.oquvmarkazcloneapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.oquvmarkazcloneapp.entity.Group;
import uz.najottalim.oquvmarkazcloneapp.entity.Student;
import uz.najottalim.oquvmarkazcloneapp.service.GroupService;
import uz.najottalim.oquvmarkazcloneapp.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupRestController {

    private final GroupService groupService;

    @GetMapping("/{id]")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Group> byId = groupService.getById(id);
        return ResponseEntity.ok(byId);
    }


    @GetMapping("/findAll")
    public List<Group> findAll() {
        List<Group> all = groupService.getAll();
        return all;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        groupService.deleteById(id);
        return ResponseEntity.ok("delete group" + id);
    }

    @PostMapping("/save")
    public Group save(@RequestBody Group group) {
        Group group1 = groupService.save(group);
        return group1;

    }

    @PutMapping("/update")
    public Group update(@RequestBody Group group) {
        Group updateGroup = groupService.update(group);
        return updateGroup;

    }
}
