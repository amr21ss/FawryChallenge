# FawryChallenge
Java OOP challenge
# Code Example

```java
Customer var1 = new Customer("Amr", 1000000.0);
ExpirableProduct var2 = new ExpirableProduct("Cheese", 500.0, 10, LocalDate.now().plusDays(1), 0.2);
ExpirableProduct var3 = new ExpirableProduct("Biscuits", 50.0, 5, LocalDate.now().plusDays(1), 0.7);
ShippableProduct var4 = new ShippableProduct("TV", 450.0, 3, 5.0);
NonShippableProduct var5 = new NonShippableProduct("Scratch Card", 10.0, 100);

Cart var6 = new Cart();
var6.add(var2, 2);
var6.add(var3, 1);
var6.add(var5, 1);

CheckingOut.checkout(var1, var6)

** Shipment Details **
1x Cheese       0g
1x Cheese       0g
1x Biscuits     1g
Total package weight 1.10kg

** Checkout receipt **
2x Cheese       1000
1x Biscuits     50
1x Scratch Card 10
----------------------
Subtotal        1060
Shipping        30
Amount          1090
Balance left    998910
