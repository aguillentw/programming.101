# 20 Numbers (integer & float)

## Creation of Price

Create a class Price accepting a **currency** (string) and an amount (integer).

Both attributes should be accessible separately.

The method `toString` should be Overiden to provide the amount and the currency as follows:

| Amount | Currency | `toString` |
|:-------|:---------|:-----------|
| 10     | USD      | 10 USD     |
| 100    | EUR      | 100 EUR    |
| 1      | GBP      | 1 GBP      |

## Apply a discount to a price

A new method `float getDiscountedPrice(float discountPercentage)` shall be created to apply a
discount on a Price object

| Initial amount | discountPercentage | `getDiscountedPrice(discountPercentage)` |
|:---------------|:-------------------|:-----------------------------------------|
| 10             | 50                 | 5.0                                      |
| 100            | 25                 | 75.0                                     |
| 200            | 10                 | 180                                      |
