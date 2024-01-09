package com.example.demo.service.impl;
import com.example.demo.entity.Product;
import com.example.demo.repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private productRepo productRepo;
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }

    public Product removeProduct(int id){
        Product product = productRepo.findById(id).get();
        productRepo.delete(product);
        return product;
    }

    public Product updateProduct(int id, Product product){
        Product productVar = productRepo.findById(id).get();
        productVar.setName(product.getName());
        productVar.setPrice(product.getPrice());
        productVar.setQuantity(product.getQuantity());
        productRepo.save(productVar);
        return productVar;
    }

    public static interface productService {

        public List<Product> getProducts();
        public Product addProduct(Product product);

        public Product removeProduct(int id);

        public Product updateProduct(int id, Product product);
    }
}
