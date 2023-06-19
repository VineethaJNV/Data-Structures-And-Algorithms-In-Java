import java.util.*;
public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("USA", 50);
        tm.put("Nepal", 30);
        System.out.println(tm);

        Set<String>keys = tm.keySet();

        for (String k : keys) {
            System.out.println(tm.get(k));
        }
    }
}
