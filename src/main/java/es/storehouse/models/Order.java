package es.storehouse.models;

import java.sql.Date;

public class Order {

    private int orderId;
    private int amount;
    private Date date;
    private int productId;
    private double price;

    public Order(int productId, int amount, double price, Date date) {
        this.amount = amount;
        this.date = date;
        this.productId = productId;
        this.price = price;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
