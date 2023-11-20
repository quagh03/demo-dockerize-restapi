package com.example.demorestapi.service;

import com.example.demorestapi.entity.Products;
import com.example.demorestapi.repository.ProductsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductsServicesImpl implements ProductsService{
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Products> getAllProducts(){
        return productsRepository.findAll();
    }

    @Override
    public Optional<Products> getProductById(Integer pid){
        try{
            Optional<Products> productToFind = productsRepository.findById(pid);
            if(productToFind.isPresent()){
                return productToFind;
            }else{
                throw new IllegalArgumentException("Product with ID " + pid + " not found");
            }
        }catch (Exception e){
            throw new RuntimeException("Error finding product: " + pid + e.getMessage());
        }
    }

    @Override
    public void addProduct(Products productToAdd){
        try {
            productsRepository.save(productToAdd);
        }catch (Exception e){
            throw new RuntimeException("Error: ", e);
        }
    }

    @Override
    public void deleteProduct(Integer pid){
        try{
            Optional<Products> tempProduct = productsRepository.findById(pid);

            if(tempProduct.isPresent()){
                productsRepository.deleteById(pid);
            }else{
                throw new IllegalArgumentException("Product with ID: " + pid + " not found!");
            }
        }catch (Exception e){
            throw new RuntimeException("Error deleting product " + e.getMessage());
        }
    }

    @Override
    public void editProduct(Integer pid, Products product){
        try {
            Optional<Products> existProduct = productsRepository.findById(pid);

            if(existProduct.isPresent()){
                BeanUtils.copyProperties(product, existProduct.get(), "pid");
                productsRepository.save(existProduct.get());
            }else {
                throw new NoSuchElementException("Can't find product with Id: " + pid);
            }
        }catch (Exception e){
            throw new RuntimeException("Error edit product " + e.getMessage());
        }
    }


}
