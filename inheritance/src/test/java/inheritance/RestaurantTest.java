package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testRestaurantToString() {
        Restaurant test1 = new Restaurant("SpiceUP", 4, "20");
        assertEquals("spiceUp's rating is 5", test1.toString());
    }

    @Test public void addReviewTest() {
        Restaurant res1 = new Restaurant("spiceUP", 4, "20");
        res1.addReview(new Review("good food", "Anna", 5));

        Review first = new Review("good enviorment", "Bill", 4);
        res1.addReview(first);

        Review second = new Review("food is nice", "Coco", 4);
        res1.addReview(second);

        Review third = new Review("I don't like it ", "Dan", 3);
        res1.addReview(third);

        Review fourth = new Review("soso food", "Mila", 2);
        res1.addReview(fourth);

        assertEquals(3, res1.numOfStars);
    }
}
