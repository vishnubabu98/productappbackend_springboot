package com.nest.productapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue
    private int id;
    private int productcode;
    private String name;
    private String mfd;
    private String expiry;
    private String brand;
    private int price;
    private String sellername;
    private String distributorname;

    public Products() {
    }

    public Products(int id, int productcode, String name, String mfd, String expiry, String brand, int price, String sellername, String distributorname) {
        this.id = id;
        this.productcode = productcode;
        this.name = name;
        this.mfd = mfd;
        this.expiry = expiry;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.distributorname = distributorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMfd() {
        return mfd;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getDistributorname() {
        return distributorname;
    }

    public void setDistributorname(String distributorname) {
        this.distributorname = distributorname;
    }
}
