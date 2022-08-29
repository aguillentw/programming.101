# Conditionals

Create a `Promotion` class that will apply promotions to a Cart depending on its content.

For the testing, you would need to put some items in the card.

The new `Promotion` class will get the Cart in the **constructor**.

Additionally, this exercise requires each `Product` to have an associated `Price` that can return a
price in EUR:

```java

class Product {

  public Product(Price price) {
    // Constructor implementation
  }

  public float getPrice() {
    return this.price.getAmount(); // getAmount() returns the price amount (forget about the currency)
  }
}
```

## Total amount of products promotions.

When the method `float getTotalAfterAllProductsDiscount()` is called, it will apply a 50%
discount to the total amount of the basket if the number of products is greater or equal than 10.

E.g. If one _Apple iPencil_ cost 10 EUR, 9 _Apple iPencil_ would cost **90 EUR**. However, 10
_Apple iPencil_ would cost, after promotion, only **50 EUR**.

## Repeated products promotions.

When the method `float getTotalAfterRepeatedProductsDiscount()` is called, it will apply a 50%
discount to the price of products that are repeated one or more times.

E.g

| Brand | Product name        | Complete product name    | Cost |
|:------|:--------------------|:-------------------------|:-----|
| Apple | iPencil             | Apple iPencil            | 10   |
| Sony  | Wireless headphones | Sony Wireless headphones | 20   |

A basket with 2 _Apple iPencil_ and 1 _Sony Wireless headphones_ would cost 30 EUR
(~~10~~ 5 + ~~10~~ 5 + 20)