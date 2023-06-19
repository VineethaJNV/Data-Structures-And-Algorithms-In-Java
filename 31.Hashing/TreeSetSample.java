import java.util.*;
public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<String>ts = new TreeSet<>();
        ts.add("Chennai");
        ts.add("Noida");
        ts.add("Bangalore");
        ts.add("Delhi");

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
