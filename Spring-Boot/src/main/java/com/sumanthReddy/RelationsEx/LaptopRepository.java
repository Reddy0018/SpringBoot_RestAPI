package com.sumanthReddy.RelationsEx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository  extends JpaRepository<Laptop,Long> {
}
