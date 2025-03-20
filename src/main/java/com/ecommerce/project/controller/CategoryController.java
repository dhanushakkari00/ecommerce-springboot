package com.ecommerce.project.controller;


import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.categoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private categoryService categoryService;

    public CategoryController(categoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("api/public/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("api/public/categories")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return " Category added succesfully";
    }
    @DeleteMapping("api/public/categories/{categoryId}")
    public String deleteCategory(@PathVariable long categoryId) {


    }

}
