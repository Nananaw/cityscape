package com.example.city.domain;

public class City {
    private int id;
    private String name;
    private String country;
    private String details;

    public City(int id, String name, String country, String details) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getDetails() {
        return details;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
