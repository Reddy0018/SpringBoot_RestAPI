package com.sumanthReddy.RelationsEx;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Students {

    @Id
    private Long id;
    private String name;
    private int marks;
    /**@OneToOne
    private Laptop laptop;*/

    @OneToMany
    private List<Laptop> laptops;
}
