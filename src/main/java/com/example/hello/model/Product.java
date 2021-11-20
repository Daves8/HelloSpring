package com.example.hello.model;

public class Product {

    private String name;
    private String description;
    private int number;
    private boolean isInStock;

    public Product() {
    }

    public Product(String name, String description, int number, boolean isInStock) {
        this.name = name;
        this.description = description;
        this.number = number;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getIsInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}