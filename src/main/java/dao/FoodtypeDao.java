package dao;

import models.Foodtype;
import models.Restaurant;

import java.util.List;

public interface FoodtypeDao {
    //create
    void add(Foodtype foodtype);//N
    void addFoodTypeToRestaurant(Foodtype foodtype, Restaurant restaurant);

    //read
    List<Foodtype> getALL(); //we may need this in the future. We can use it to retrieve all Foodtypes.
    List<Restaurant> getAllRestaurantsByFoodType(int id);
    //E we will implement this soon.

    //update
    //omit for now

    //delete
    void deleteById(int id);
}
