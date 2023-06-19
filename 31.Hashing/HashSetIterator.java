import java.util.*;
public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<String>cities = new HashSet<>();
        cities.add("Bangalore");
        cities.add("chennai");
        cities.add("Noida");
        cities.add("Hyderabad");
        cities.add("New Delhi");

        // Iterator it = cities.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //Advanced for loop
        for (String city : cities) {
            System.out.println(city);
            
        }
    }
}
