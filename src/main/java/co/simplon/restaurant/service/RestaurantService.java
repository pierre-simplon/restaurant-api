package co.simplon.restaurant.service;

import co.simplon.restaurant.model.Restaurant;
import co.simplon.restaurant.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {

    /**
     * Get the complete list of restaurants.
     *
     * @return the complete list from persistence layer.
     */
    List<Restaurant> getRestaurants();

    /**
     * Restaurant review creation method.
     *
     * @param restaurantId the restaurant on which to link the review
     * @param reviewToCreate the review to create
     * @return the createdReview
     */
    Review createReview(Long restaurantId, Review reviewToCreate);

    /**
     * Review removal method
     *
     * @param restaurantId the linked restaurant
     * @param reviewId the review id to remove
     * @return true if removal possible, false otherwise
     */
    boolean deleteReview(Long restaurantId, Long reviewId);
}
