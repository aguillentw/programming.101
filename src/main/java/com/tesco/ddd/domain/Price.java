package com.tesco.ddd.domain;

public class Price {

  private String currency;
  private Integer amount;

  public Price(String currency, Integer amount) {
    this.currency = currency;
    this.amount = amount;
  }

  public String getCurrency() {
    return currency;
  }

  public Integer getAmount() {
    return amount;
  }

  public Float getDiscountedPrice(Float discountPercentage) {
    Float originalAmount = Float.valueOf(this.amount);
    Float discount = originalAmount * (discountPercentage / Float.valueOf(100));
    return originalAmount - discount;
  }

  @Override
  public String toString() {
    return "Price{" + amount + " " + currency + "}";
  }
}
