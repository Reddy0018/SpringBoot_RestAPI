package com.sumanthReddy.RelationsEx;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@EqualsAndHashCode
@Entity(name = "Laptop")
@Table(name = "Laptop")
public class Laptop {

    @Id
    private Long id;
    private String lname;
}
