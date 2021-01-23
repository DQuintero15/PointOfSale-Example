package es.storehouse.models;

import java.sql.Date;

public class Order {

    private int orderId;
    private int amount;
    private Date date;
    private int productId;
    private int providerId;

    public Order(int orderId, int amount, Date date, int productId, int providerId) {
        this.orderId = orderId;
        this.amount = amount;
        this.date = date;
        this.productId = productId;
        this.providerId = providerId;
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

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

}
