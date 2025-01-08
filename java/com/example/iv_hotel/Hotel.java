package com.example.iv_hotel;
public class Hotel {
    private String name;
    private double rating;
    private String location;
    private String description;
    private String imageUrl;
    private String price;
    private String contact;
    private int reviews;
    private String discount;
    private String facilities;
    private String checkInTime;
    private String checkOutTime;
    private String foodMenu;

    public Hotel(String name, double rating, String location, String description, String imageUrl,
                 String price, String contact, int reviews, String discount, String facilities,
                 String checkInTime, String checkOutTime, String foodMenu) {
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.contact = contact;
        this.reviews = reviews;
        this.discount = discount;
        this.facilities = facilities;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.foodMenu = foodMenu;
    }


    public String getName() { return name; }
    public double getRating() { return rating; }
    public String getLocation() { return location; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }
    public String getPrice() { return price; }
    public String getContact() { return contact; }
    public int getReviews() { return reviews; }
    public String getDiscount() { return discount; }
    public String getFacilities() { return facilities; }
    public String getCheckInTime() { return checkInTime; }
    public String getCheckOutTime() { return checkOutTime; }
    public String getFoodMenu() { return foodMenu; }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public void setFoodMenu(String foodMenu) {
        this.foodMenu = foodMenu;
    }
}


