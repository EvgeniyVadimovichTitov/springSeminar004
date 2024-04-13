package com.example.StartThymeleaf.repositories;

import com.example.StartThymeleaf.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@org.springframework.stereotype.Repository
public class Repository implements IRepository{
    private List<Product> products;

    public Repository() {
        this.products = new ArrayList<>();
        products.add(new Product("book", 1,129.99,6));
        products.add(new Product("notebook", 2,500.00,34));
    }

    @Override
    public String buy(long id) {
        List<Integer> tmp = products.stream().map(it->del(id,it)).toList();
        if(tmp.contains(0)){
            return "ended";
        }
        return "buy";
    }

    @Override
    public List<Product> show() {
        return products;
    }

    private int del(long id, Product product){
        if(product.getId() == id){
            if(product.getCount()<1){
                return 0;
            }
            product.setCount(product.getCount()-1);
        }
        return 1;
    }

}
