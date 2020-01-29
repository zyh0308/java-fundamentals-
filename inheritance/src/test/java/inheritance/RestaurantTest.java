package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testRestaurantToString() {
        Restaurant test1 = new Restaurant("SpiceUP", 4);
        assertEquals("spiceUp's rating is 5", test1.toString());
    }

    @Test public void addReviewTest() {
        Restaurant res1 = new Restaurant("SpiceUP", 4);
        res1.addReview(new Review("good food", "Anna", 5));

        res1.addReview  (new Review("good enviorment", "Bill", 4));


        res1.addReview  (new Review("food is nice", "Coco", 4));


        res1.addReview (new Review("I don't like it ", "Dan", 3));


        res1.addReview  (new Review("soso food", "Mila", 2));

        assertEquals(3, res1.reviewStars);
    }
}
