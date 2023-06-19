import java.util.*;
public class LinkedHashM {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 150);
        lhm.put("USA", 50);
        lhm.put("Nepal", 30);
        System.out.println(lhm);

        Set<String>keys = lhm.keySet();
        for (String key : keys) {
            System.out.println(lhm.get(key));
        }
    }
}
