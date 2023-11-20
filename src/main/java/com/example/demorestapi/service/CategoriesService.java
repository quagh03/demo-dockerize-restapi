package com.example.demorestapi.service;

import com.example.demorestapi.entity.Categories;

import java.util.List;
import java.util.Optional;

public interface CategoriesService {
    List<Categories> getAllCategories();

    Categories addCategories(Categories categories);

    Optional<Categories> findCategoryById(Integer cid);

    void deleteCategoryById(Integer cid);

    void editCategory(Integer cid, Categories categories);
}
