package com.allstate.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "products")
@Data
public class Product {

    private int id;
    private String name;
    private String stock_number;
    private String description;
    private int rating;
    private int no_of_reviews;
    private double actual_price;
    private int discount;
    private double discounted_price;
    private int quantity;
    private boolean is_restricted;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public String getstock_number() {
        return stock_number;
    }
    public void setstock_number(String stockNumber) {
        this.stock_number = stockNumber;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNoOfReviews() {
        return no_of_reviews;
    }
    public void setNoOfReviews(int noOfReviews) {
        this.no_of_reviews = noOfReviews;
    }

    @Column(nullable = false)
    public double getActualPrice() {
        return actual_price;
    }
    public void setActualPrice(double actualPrice) {
        this.actual_price = actualPrice;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getDiscounted_price() {
        return discounted_price;
    }
    public void setDiscounted_price(double discountedPrice) {
        this.discounted_price = discountedPrice;
    }

    @Column(nullable = false)
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getis_restricted() {
        return is_restricted;
    }
    public void setis_restricted(boolean is_restricted) {
        is_restricted = is_restricted;
    }



}
