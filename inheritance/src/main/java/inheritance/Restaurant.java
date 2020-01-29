package inheritance;

import java.util.LinkedList;

public class Restaurant extends Business{


    public Restaurant(String name, int price){
        super(name, price);

    }

    public String toString(){
        return this.name + "'s rating is " + this.reviewStars;
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
