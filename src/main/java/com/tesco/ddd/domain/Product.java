package com.tesco.ddd.domain;

public class Product {
    private String brand;
    private String name;

    public Product(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "branch='" + brand + "'," +
                "name='" + name + "'" +
                '}';
    }
}