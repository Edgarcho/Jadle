import models.Foodtype;
import models.Restaurant;

import java.util.List;

public interface RestaurantDao {

    //create
    void add (Restaurant restaurant); //J
    void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype);
    void add(Foodtype foodtype); // Q
    void addFoodtypeToRestaurant(Foodtype foodtype, Restaurant restaurant);

    //read
    List<Restaurant> getAll(); //A
    List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId);
    List<Foodtype> getAll();
    List<Restaurant> getAllRestaurantsForAFoodtype(int id);
    Restaurant findById(int id); //B & C

    //update
    void update(int id, String name, String address, String zipcode, String phone, String website, String email); //L

    //delete
    void deleteById(int id); //K
}