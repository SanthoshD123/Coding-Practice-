***
Got it! Let's focus on improving the description's structure and comments instead of writing the code. Here's a more structured version of your description with comments:

---

**Task:**

Implement Java code based on the following specifications. The code should match the specifications precisely.

---

**Specifications:**

1. **Class Definitions:**

   - **Class: Customer**
     - **Data Fields:**
       - `int id`
       - `String name`
       - `double walletBalance`
       - `String address`
     - **Method Definitions:**
       - Parameterized constructor with public visibility

   - **Class: Item**
     - **Data Fields:**
       - `int id`
       - `String name`
       - `String companyName`
       - `double price`
       - `boolean isInStock`
     - **Method Definitions:**
       - Parameterized constructor with public visibility

   - **Class: ShoppingWebsite**
     - **Method Definition:**
       - `purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException`
         - Return type: `String`
         - Visibility: `public`

   - **Class: InsufficientBalanceException** extends `Exception`
     - **Method Definition:**
       - `InsufficientBalanceException(String message)`
         - Visibility: `public`

   - **Class: ItemOutOfStockException** extends `Exception`
     - **Method Definition:**
       - `ItemOutOfStockException(String message)`
         - Visibility: `public`

---

**Task Details:**

- Implement `class Customer` according to the specifications
- Implement `class Item` according to the specifications
- Implement `class ShoppingWebsite`
  - `String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException`
    - Throw an `ItemOutOfStockException` when the item is out of stock with the message "Item is out of stock".
    - Throw an `InsufficientBalanceException` when customer wallet balance is not sufficient (Item price is greater than the wallet balance) with the message "Customer wallet balance is not sufficient".
    - If no exception is found, then return "Order Successful".

- Implement custom exception `class InsufficientBalanceException`
  - Define a parameterized constructor with a `String` argument to pass the message to the superclass.

- Implement custom exception `class ItemOutOfStockException`
  - Define a parameterized constructor with a `String` argument to pass the message to the superclass.

---

**Sample Testcase:**

```java
// Sample Testcase

Customer cusDet = new Customer(927392, "Steve", 5000.0, "USA");
Item itemDet = new Item(27392, "T-Shirt", "US Polo", 800, true);
ShoppingWebsite obj = new ShoppingWebsite();
String out = obj.purchaseItem(itemDet, cusDet);

// Output
// out: "Order Successful"
```

---

This version of your description should be clearer and better structured. Let me know if there's anything else you need! ***

code :

import java.io.*;

class Customer {
    int id;
    String name;
    double walletBalance;
    String address;

    // Parameterized constructor
    public Customer(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }
}

class Item {
    int id;
    String name;
    String companyName;
    double price;
    boolean isInStock;

    // Parameterized constructor
    public Item(int id, String name, String companyName, double price, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.isInStock = isInStock;
    }
}

class ShoppingWebsite {
    // Method to handle item purchase
    public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException {
        if (!i.isInStock) {
            throw new ItemOutOfStockException("item is out of stock");
        }
        if (c.walletBalance < i.price) {
            throw new InsufficientBalanceException("customer wallet balance is not sufficient");
        }
        return "Order Successful";
    }
}

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Item Out of Stock
class ItemOutOfStockException extends Exception {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}

// Main class to test the implementation
public class Source {
    public static void main(String args[]) throws Exception {
        Customer cusDet = new Customer(927392, "Steve", 5000.0, "USA");
        Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
        ShoppingWebsite obj = new ShoppingWebsite();

        try {
            String out = obj.purchaseItem(itemDet, cusDet);
            System.out.println(out);
        } catch (ItemOutOfStockException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
