package org.example.store;

public class Stock {
    private Product product;
    private Integer quantity;

    public Stock(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
               "product=" + product +
               ", quantity=" + quantity +
               '}';
    }
}
