package com.maxyespindola.universidad.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeacher;

    @NotEmpty
    private String name;

    @NotEmpty
    private String lastname;

    @NotEmpty
    private String dni;

    @NotNull
    private boolean active = true;

    @OneToMany
    @JoinColumn(name = "teacher_id")
    private Set<Subject> subjects;
}
