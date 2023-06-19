import java.util.*;
public class LinkedHshSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String>lhs = new LinkedHashSet<>();

        lhs.add("Chennai");
        lhs.add("Noida");
        lhs.add("Bangalore");
        lhs.add("Delhi");

        System.out.println(lhs);

        for (String strings : lhs) {
            System.out.println(strings);
        }
    }
}
