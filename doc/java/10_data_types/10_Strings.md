# Strings
Modify Product so that instead of having a composed name for the product (e.g. 'Apple iPencil',
it accepts a **Product Brand** ('Apple') and a **Product Name** (e.g. 'iPencil').

Both attributes should be accessible separately (e.g. `product.getBrand()` and `product.getName()`)

A method `product.getCompleteName()` should support returning the complete product name:

| Brand | Product name        | Complete product name    |
|:------|:--------------------|:-------------------------|
| Apple | iPencil             | Apple iPencil            |
| Sony  | Wireless headphones | Sony Wireless headphones |
