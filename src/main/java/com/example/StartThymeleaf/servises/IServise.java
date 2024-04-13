package com.example.StartThymeleaf.servises;


import com.example.StartThymeleaf.models.Product;

import java.util.List;

public interface IServise {
    String buy(long id);
    List<Product> show();

}
