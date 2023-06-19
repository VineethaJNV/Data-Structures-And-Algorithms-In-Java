import java.util.*;
public class IterateOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 1000);
        map.put("China", 800);
        map.put("Nepal", 500);
        map.put("Bhutan", 400);
        map.put("Sri Lanka", 200);

        Set<String>keys = map.keySet();

        for (String str : keys) {
            System.out.println(map.get(str));
        }
        Set<String, Integer>key = map.entrySet();
        for (String string : key) {
            System.out.println(string);
        }
    }
}
