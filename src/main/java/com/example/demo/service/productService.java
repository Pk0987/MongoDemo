package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Product;

public interface productService {

    public List<Product> getProducts();
    public Product addProduct(Product product);

    public Product removeProduct(int id);

    public Product updateProduct(int id, Product product);
}
