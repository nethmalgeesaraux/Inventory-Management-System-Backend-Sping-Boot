package com.example.Inventory.System.services;

import com.example.Inventory.System.dtos.CategoryDTO;
import com.example.Inventory.System.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}