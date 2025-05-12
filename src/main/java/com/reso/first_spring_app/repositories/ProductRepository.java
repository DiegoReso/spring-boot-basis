package com.reso.first_spring_app.repositories;

import com.reso.first_spring_app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Long id(Long id);
}
