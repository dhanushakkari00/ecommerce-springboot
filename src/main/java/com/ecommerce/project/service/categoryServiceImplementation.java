package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class categoryServiceImplementation implements categoryService{
    private List<Category> categories = new ArrayList<>();
    private long cat = 0;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(cat+1);
        categories.add(category);
    }

    @Override
    public String deleteCategory(long categoryId) {
        Category category = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst().get();
        categories.remove(category);
        return "Category id "+categoryId+" deleted succesfully";
    }

}
