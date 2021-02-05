package es.storehouse.models;

import java.sql.Date;

public class Sale {

    private int saleId;
    private int amount;
    private Double price;
    private Date date;
    private int productId;

    public Sale(int amount, Double price, Date date) {
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    public Sale( int amount, Double price, Date date, int productId) {
        this.amount = amount;
        this.price = price;
        this.date = date;
        this.productId = productId;
    }

    
    
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    

}
