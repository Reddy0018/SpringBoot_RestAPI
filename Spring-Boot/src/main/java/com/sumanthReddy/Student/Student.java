package com.sumanthReddy.Student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id
    @SequenceGenerator(name = "Student_Sequence",sequenceName = "Student_Sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "Student_Sequence")
    private  Long id;
    private String name;
    private String email;
    private LocalDate dob;
    //@Transient
    private  int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Period.between(this.dob,LocalDate.now()).getYears();
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        //this.age = Period.between(this.dob,LocalDate.now()).getYears();
    }
}
