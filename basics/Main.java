import java.time.LocalDateTime;

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

     //call timeclock function 
     clock();

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

  System.out.println("It took " + flips +"flips to flip " + number +" heads in a row");
  }

  //Command Line Clock
 public static void clock(){
       LocalDateTime now = LocalDateTime.now();
       int hour = now.getHour();
       int minute = now.getMinute();
       int lastSecond = now.getSecond();
       System.out.println(hour + ":" + minute + ":" + lastSecond);
 
      while(true){
        now = LocalDateTime.now();
        if (now.getSecond()!=lastSecond){
          hour = now.getHour();
          minute = now.getMinute();
         lastSecond = now.getSecond();
       System.out.println(hour + ":" + minute + ":" + lastSecond);

        }
      }
 }
}

