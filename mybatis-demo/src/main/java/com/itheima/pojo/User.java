package com.itheima.pojo;

public class User {
    private String id;
    private String title;
    private String publisher;
    private int price;
    private int number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
