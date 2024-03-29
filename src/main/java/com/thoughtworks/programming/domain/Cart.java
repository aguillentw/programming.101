package com.thoughtworks.programming.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private List<Item> items = new ArrayList<>();

  public void add(Item item) {
    items.add(item);
  }

  public List<Item> getItems() {
    return items;
  }

  public void remove(Item item) {
    Product product = item.getProduct();

    items.removeIf(i -> i.getProduct().getName().equals(product.getName()));
  }

  @Override
  public String toString() {
    return "Cart{" +
        "items=" + items +
        '}';
  }
}