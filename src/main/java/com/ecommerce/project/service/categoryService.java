package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

public interface categoryService{
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(long categoryId);

}
