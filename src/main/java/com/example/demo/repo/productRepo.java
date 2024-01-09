package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.Product;

public interface productRepo extends MongoRepository<Product,Integer> {



}
