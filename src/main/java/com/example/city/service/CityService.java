package com.example.city.service;

import java.util.List;

import com.example.city.domain.City;
import com.example.city.domain.Trip;
import com.example.city.repository.CityRepository;

public class CityService {
    private CityRepository cityRepository;

    public City createCity(City city) {
        return cityRepository.saveCity(city);
    }

    public Trip createTrip(Trip trip) {
        return cityRepository.saveTrip(trip);
    }

    public void deleteCityById(int id) {
        cityRepository.deleteCityById(id);
    }

    public void deleteTripById(int id) {
        cityRepository.deleteTripById(id);
    }

    public City updateCity(int id, City city) {
        return cityRepository.updateCity(id, city);
    }

    public Trip updateTrip(int id, Trip trip) {
        return cityRepository.updateTrip(id, trip);
    }

    public City findCityById(int id) {
        return cityRepository.findCityById(id);
    }

    public Trip findTripById(int id) {
        return cityRepository.findTripById(id);
    }

    public List<City> findAllCities() {
        return cityRepository.findAllCities();
    }

    public List<Trip> findAllTrips() {
        return cityRepository.findAllTrips();
    }
}
