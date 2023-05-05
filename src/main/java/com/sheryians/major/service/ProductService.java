package com.sheryians.major.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.model.Product;
import com.sheryians.major.repository.ProductRepository;
import java.util.List;;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){return productRepository.findAll();}
    
}
