package com.ensayo.mapstrcut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensayo.mapstrcut.entity.Category;

@Repository
public interface categoryRepository extends JpaRepository<Category, Long> {
    
}
