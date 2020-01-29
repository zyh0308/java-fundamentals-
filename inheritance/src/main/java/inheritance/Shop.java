package inheritance;

public class Shop extends Business{
    String description;

    public Shop(String name, int price, String description){
        super(name, price);
        this.description=description;

    }

    public String toString(){
        return this.name + "'s rating is " + this.reviewStars;
    }

}
