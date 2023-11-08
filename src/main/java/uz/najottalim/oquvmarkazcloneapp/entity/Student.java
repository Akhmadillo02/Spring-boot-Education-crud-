package uz.najottalim.oquvmarkazcloneapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long age;

    private String gender;

    private String email;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Group group;
}
