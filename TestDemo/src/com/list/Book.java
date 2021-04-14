package com.list;

public class Book {
    private String name;
    private int price;
    private String auther;
    public Book(String name, int price, String auther) {
        this.name = name;
        this.price = price;
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "name " + this.name+"\t\tauther "+this.auther+"\t\tprice "+this.price;
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

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
