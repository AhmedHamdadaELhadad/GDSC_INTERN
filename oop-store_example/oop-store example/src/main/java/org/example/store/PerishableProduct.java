package org.example.store;

import java.time.LocalDate;

// inheritance represents an IS-A relationship
public class PerishableProduct extends Product {
    private LocalDate expiryDate;

    public PerishableProduct(String name, Double price, String description, LocalDate expiryDate) {
        super(name, price, description);
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product" + super.toString() +
               "expiryDate=" + expiryDate +
               '}';
    }
}
