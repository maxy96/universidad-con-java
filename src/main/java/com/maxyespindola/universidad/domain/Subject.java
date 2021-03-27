package com.maxyespindola.universidad.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "subjects")
public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubject;

    @NotEmpty
    private String name;

    @NotEmpty
    @Min(0)
    @Positive
    private int cupo;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teachers;


}
