package com.example.CategoryProduct.service;

import com.example.CategoryProduct.model.Category;
import java.util.List;

public interface CategoryService {
	List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);

}
