package com.example.city.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.city.domain.City;
import com.example.city.domain.Trip;
import com.example.city.service.CityService;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getAllCities")
    public List<City> getAllCities() {
        return cityService.findAllCities();
    }

    @GetMapping("/getAllTrips")
    public List<Trip> getAllTrips() {
        return cityService.findAllTrips();
    }

    @GetMapping("/getCity/{id}")
    public ResponseEntity<City> getCityById(@PathVariable int id) {
        return cityService.findCityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/getTrip/{id}")
    public ResponseEntity<Trip> getTripById(@PathVariable int id) {
        return cityService.findTripById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/addCity")
    public City createCity(@RequestBody City city) {
        return cityService.createCity(city);
    }

    @PostMapping("/addTrip")
    public Trip createTrip(@RequestBody Trip trip) {
        return cityService.createTrip(trip);
    }

    @PutMapping("/updateCity/{id}")
    public ResponseEntity<City> updateCity(@PathVariable int id, @RequestBody City updatedCity) {
        City city = cityService.updateCity(id, updatedCity);
        if (city == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(city);
    }

    @PutMapping("/updateTrip/{id}")
    public ResponseEntity<Trip> updateTrip(@PathVariable int id, @RequestBody Trip updatedTrip) {
        Trip trip = cityService.updateTrip(id, updatedTrip);
        if (trip == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(trip);
    }

    @DeleteMapping("/deleteCity/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable int id) {
        cityService.deleteCityById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteTrip/{id}")
    public ResponseEntity<Void> deleteTrip(@PathVariable int id) {
        cityService.deleteTripById(id);
        return ResponseEntity.noContent().build();
    }
}
