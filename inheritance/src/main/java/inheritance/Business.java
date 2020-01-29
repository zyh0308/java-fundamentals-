package inheritance;

import java.util.LinkedList;

public class Business {
    String name;
    int price;
    int reviewStars;
    LinkedList<Review> reviews;



    public Business(String name, int price) {
        this.name = name;
        this.price = price;
        this.reviewStars=0;
        this.reviews = new LinkedList<>();
    }

    public void addReview(Review review){

        this.reviews.add(review);

        int total = 0;
        for(Review r : reviews) {
            total += r.reviewStar;
        }
        total=total/reviews.size();
        this.reviewStars=total;


    }


}
