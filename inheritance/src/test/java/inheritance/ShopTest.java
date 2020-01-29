package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test public void testShopToString() {
        Shop test1 = new Shop("hat store", 4, "this is a hat shop");
        assertEquals("hat store's rating is 5", test1.toString());
    }

    @Test public void addReviewTest() {
        Shop shop= new Shop("hat store", 4,"this is a hat shop");
        shop.addReview(new Review("good hat", "Anna", 5));

        shop.addReview  (new Review("good enviorment", "Bill", 4));


        shop.addReview  (new Review("hat is nice", "Coco", 4));


        shop.addReview (new Review("I don't like it ", "Dan", 3));


        shop.addReview  (new Review("soso hat", "Mila", 2));

        assertEquals(3, shop.reviewStars);
    }
}