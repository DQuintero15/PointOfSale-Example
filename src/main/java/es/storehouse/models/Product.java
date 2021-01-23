package es.storehouse.models;

import java.math.BigDecimal;

public class Product {

    private int productId;
    private String name;
    private int amount;
    private BigDecimal buyPrice;
    private BigDecimal sellPrice;
    private String provider;

    public Product(int productId, String name, int amount, BigDecimal buyPrice, BigDecimal sellPrice, String provider) {
        this.productId = productId;
        this.name = name;
        this.amount = amount;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.provider = provider;
    }

    public Product(String name, int amount, BigDecimal buyPrice, BigDecimal sellPrice, String provider) {
        this.name = name;
        this.amount = amount;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.provider = provider;
    }

    public Product(String name){
        this.name = name;
    }
    
    public Product(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}
