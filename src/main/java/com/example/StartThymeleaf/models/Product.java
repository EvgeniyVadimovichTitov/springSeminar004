package com.example.StartThymeleaf.models;


import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private double cost;
    private int count;

    public Product(String name, long id, double cost, int count) {
        this.name = name;
        this.id = id;
        this.cost = cost;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(cost, product.cost) == 0 && count == product.count && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost, count);
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }
}
