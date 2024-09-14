package com.Teacher.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false, unique = true)
    private String mobile;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "salary", nullable = false)
    private String salary;

    @Column(name = "subject")
    private String subject;

}