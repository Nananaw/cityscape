package com.example.city.domain;

import java.time.LocalDate;

public class Trip {
    private int id;
    private City city;
    private LocalDate startDate;
    private LocalDate endDate;
    private int rating;
    private String personalNotes;

    public int getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getRating() {
        return rating;
    }

    public String getPersonalNotes() {
        return personalNotes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPersonalNotes(String personalNotes) {
        this.personalNotes = personalNotes;
    }
}
