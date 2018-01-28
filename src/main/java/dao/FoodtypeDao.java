package dao;

import models.Foodtype;

import java.util.List;

public interface FoodtypeDao {
    //create
    void add(Foodtype foodtype);//N
    //void addFoodTypeToRestaurant(Foodtype foodtype, Restaurant restaurant);

    //read
    List<Foodtype> getALL(); //we may need this in the future. We can use it to retrieve all Foodtypes.

    //List<Restaurant> getAllRestaurantsForAFoodType(int id);
    //E we will implement this soon.

    //update
    //omit for now

    //delete
    void deleteById(int id);
}
