package inheritance;

import java.util.LinkedList;

public class Restaurant {
    String name;
    int reviewStars;
    int price;
    LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, int reviewStars, int price){
        this.name =name;
        this.reviewStars=reviewStars;
        this.price=price;

    }

    public String toString(){
        return this.name + "'s rating is " + this.reviewStars;
    }

   public String addReview(Review review){





   }



}
