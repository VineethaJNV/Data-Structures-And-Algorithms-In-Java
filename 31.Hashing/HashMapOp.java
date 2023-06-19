import java.util.*;
public class HashMapOp {
    public static void main(String[] args) {
        HashMap<String, Integer>hm = new HashMap<>();

        //Insert => O(1)
        hm.put("India", 1000);
        hm.put("China", 800);
        hm.put("Sri Lanka", 100);
        hm.put("Bhutan", 50);
        System.out.println(hm);

        //Get => O(1)
        System.out.println(hm.get("India"));

        System.out.println(hm.get("Nepal"));

        //containsKey() => O(1)
        System.out.println(hm.containsKey("India"));

        // remove op => O(1)
        hm.remove("China");
        System.out.println(hm.remove("Nepal"));
        System.out.println(hm);
    }
}
