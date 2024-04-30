package org.example.store;

public class Store {
    public static final int MAX_STOCKS = 100;
    private String name;
    private String address;
    private String ownerName;
    private Stock[] stocks;
    private int stockCount;

    public Store(String name, String address, String ownerName) {
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
        this.stocks = new Stock[MAX_STOCKS];
        this.stockCount = 0;
    }

    public void displayPerishableProducts(int minimumQuantity){
        System.out.println("Displaying all Perishable products");
        for (int i=0;i<stockCount;i++){
            Stock currentStock = stocks[i];
            if (currentStock.getProduct() instanceof PerishableProduct && currentStock.getQuantity() < minimumQuantity){
                PerishableProduct p = (PerishableProduct) currentStock.getProduct();
                System.out.println("Product"+ p);
            }
        }

    }

    public void displayStock(){
        System.out.println("Displaying all stocks");
        for (int i = 0; i < stockCount; i++) {
            System.out.println(stocks[i]);
        }
    }
    public void addStock(Stock s){
        stocks[stockCount] = s;
        stockCount++;
    }
    public void removeStock(int index){
        if (index > MAX_STOCKS || index < stockCount){
            System.out.println("Invalid index: "+ index);
        }
        stocks[index] = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
