
public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        
      //call flipping function
        flipNHeads(2);
    }

    // Pluralize function
    public static String pluralize(String word,int count ) {
        if (count > 1 || count == 0) {
            return (word + "s");
        } else {
            return (word);
        }
    }


//Flipping Coins
public static void flipNHeads(int number ) {
    int flips=0;
    int counter=number;
    while(counter != 0){
        double rand = Math.random();
        if (rand<0.5){
            flips++;
            counter=number;
            System.out.println("tails");

        }else{
            flips++;
            counter--;
            System.out.println("heads");

 } 
    
  }

  System.out.println("It took " + flips +"flips to flip " +number+" heads in a row");
  }

  //


}
