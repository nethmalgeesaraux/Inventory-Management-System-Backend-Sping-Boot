package com.example.Inventory.System.repositories;

import com.example.Inventory.System.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
