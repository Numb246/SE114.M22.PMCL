package com.example.marketapplication_se114_m22_pmcl.Model;

public class Order {
    private String ProductId;
    private String ProductName;
    private String Quantity;
    private String Price;
    private String Discount;

    public Order() {
    }

    public Order(String productId, String productName, String quantity, String price, String discount) {
        ProductId = productId;
        ProductName = productName;
        Quantity = quantity;
        Price = price;
        Discount = discount;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public String getDiscount() {
        return Discount;
    }
}
