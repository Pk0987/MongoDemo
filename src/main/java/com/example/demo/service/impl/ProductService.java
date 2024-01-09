package com.example.demo.service.impl;

import java.util.List;
import com.example.demo.entity.Product;

public interface ProductService {

    public List<Product> getProducts();
    public Product addProduct(Product product);

    public Product removeProduct(int id);

    public Product updateProduct(int id, Product product);
}
