package com.example.StartThymeleaf.repositories;

import com.example.StartThymeleaf.models.Product;

import java.util.List;

public interface IRepository {
    String buy(long id);
    List<Product> show();
}
