package co.simplon.restaurant;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestaurantApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }


    @Test
    public void getRestaurants(){
        // When retrieving restaurants from /api/restaurants
        List<?> restaurant = this.restTemplate.getForObject("/api/restaurants", List.class);

        // Then a non null list should be returned
        assertThat(restaurant).isNotNull();
    }

}
