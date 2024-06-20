package com.ensayo.mapstrcut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensayo.mapstrcut.entity.Product;

@Repository
public interface productRepository extends JpaRepository<Product,Long>{
    
}
