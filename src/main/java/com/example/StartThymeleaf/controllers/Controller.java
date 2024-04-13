package com.example.StartThymeleaf.controllers;

import org.springframework.ui.Model;
import com.example.StartThymeleaf.models.Product;
import com.example.StartThymeleaf.servises.IServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IServise servise;

    @GetMapping("/start")
    public String findAll(Model model){

        List<Product> products = servise.show();

        model.addAttribute("products", products);
        return "start";
    }
    @GetMapping("/buy/{id}")
    public  String buy(@PathVariable(name = "id") long id){

        return servise.buy(id);//возвращает страницу buy или ended в зависимости от количества товара
    }

}
