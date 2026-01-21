package com.example.Inventory.System.services;

import com.example.Inventory.System.dtos.Response;
import com.example.Inventory.System.dtos.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);
}
