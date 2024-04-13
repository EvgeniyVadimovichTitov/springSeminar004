package com.example.StartThymeleaf.servises;

import com.example.StartThymeleaf.models.Product;
import com.example.StartThymeleaf.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servise implements IServise{

    private final IRepository repository;

    public Servise(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public String buy(long id) {
        return repository.buy(id);
    }

    @Override
    public List<Product> show() {
        return repository.show();
    }
}
