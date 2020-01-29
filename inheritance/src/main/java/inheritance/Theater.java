package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Theater extends Business {
    List<String> movies;

    public Theater(String name, int price) {
        super(name, price);
        movies = new LinkedList<>();
    }

}