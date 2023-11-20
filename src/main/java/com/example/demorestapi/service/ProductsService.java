package com.example.demorestapi.service;

import com.example.demorestapi.entity.Products;

import java.util.List;
import java.util.Optional;

public interface ProductsService {
    List<Products> getAllProducts();

    Optional<Products> getProductById(Integer pid);

    void addProduct(Products productToAdd);

    void deleteProduct(Integer pid);

    void editProduct(Integer pid, Products product);
}
