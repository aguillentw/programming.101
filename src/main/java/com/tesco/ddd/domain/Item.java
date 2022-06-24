package com.tesco.ddd.domain;

public class Item {
    private Product product;

    public Item(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                '}';
    }
}
