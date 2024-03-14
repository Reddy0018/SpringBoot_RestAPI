package com.sumanthReddy.Person;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Entity(name = "Person")
@Table(name = "Person",uniqueConstraints = {
        @UniqueConstraint(name = "Student_Email_Unique", columnNames = "email")
})
public class Person {

    public Person(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    @Id
    @SequenceGenerator(name = "Person_Seq", sequenceName = "Person_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Person_Seq")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "email", columnDefinition = "TEXT", nullable = false)
    private String email;
    @Column(name = "age", nullable = false)
    private int age;

}
