# Method arguments
## Prerequisites
For this exercise you will need the `Price` class. You can use the one created in
[102_Numbers](../10_data_types/102_Numbers.md) exercise or the following one:

```java
public class Price {
  
  private Float value;
  private String currency;
  
  public Price (Float value, String currency) {
    this.value = value;
    this.currency = currency;
  }
  
  public Float getValue() {
    return value;
  }
  
  public String getCurrency() {
    return currency;
  }
}
```

## Exercise
Create a class `PriceReducer` that will modify Prices by applying promotions, discounts and other
price reductions.

**Apply promotions**.
* Create a method `addPromotion` to add promotions to the `PriceReducer`. The method will receive a
`promotionId` (string) and a `percentage` (float) to be reduced from the price. 

  **Hint**: You need to think carefully how to store the promotions in the `PriceReducer` as they
  are going to be identified (applied in the next point) by using only the `promotionId`.

* Add a method to apply a promotion to a given price. The method will receive an input `Price` and
  a `promotionId` and return a output **new** `Price` with the discount applied.

**Apply discounts**

