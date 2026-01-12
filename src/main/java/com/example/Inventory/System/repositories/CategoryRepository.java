package com.example.Inventory.System.repositories;

import com.example.Inventory.System.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
