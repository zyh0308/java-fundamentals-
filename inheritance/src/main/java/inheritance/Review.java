package inheritance;

public class Review {
    public String reviewBody;
    public String reviewAuthor;
    public int reviewStar;

    public Review (String reviewBody,String reviewAuthor,int reviewStar){
        this.reviewBody=reviewBody;
        this.reviewAuthor=reviewAuthor;
        this.reviewStar=reviewStar;
    }

    public String toString(){
        return "This place is " + this.reviewStar + "Here is the detail" + this.reviewBody + "by "+ this.reviewAuthor;
    }
}
