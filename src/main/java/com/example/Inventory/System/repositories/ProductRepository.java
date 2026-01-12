package com.example.Inventory.System.repositories;

import com.example.Inventory.System.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}
