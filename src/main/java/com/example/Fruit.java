/*
* File: Fruit.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/eros/
* Licenc: MIT
*/

package com.example;

public class Fruit {
    int id;
    String name;
    int price;
    int quantity;
    String description;
    
    public Fruit() {}
    public Fruit(String name, int price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    public Fruit(int id, String name, int price, int quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    

    @Override
    public String toString() {
        return "Fruit [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    

    
}
