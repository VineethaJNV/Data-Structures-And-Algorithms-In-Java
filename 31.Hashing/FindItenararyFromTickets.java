import java.util.*;
public class FindItenararyFromTickets{
    public static void main(String[] args) {
        String tickets[][] = {{"Chennai", "Bangalore"},
                              {"Mumbai", "Delhi"},
                              {"Goa", "Chennai"},
                               {"Delhi", "Goa"}};
        HashMap<String, String>map = new HashMap<>();

        for(int i = 0 ; i < tickets.length; i++){
            String from = tickets[i][0];
            String to = tickets[i][1];
            map.put(from, to);
        }

        HashMap<String, String>revMap = new HashMap<>();
        for(int i = 0 ; i< tickets.length; i++){
            String from = tickets[i][0];
            String to = tickets[i][1];
            revMap.put(to, from);
        }
        System.out.println(map);
        System.out.println(revMap);

        Set<String> keys = map.keySet();
        String stPt = "";
        for (String k : keys) {
            if(!revMap.containsKey(k)){
                stPt = k;
            }
        }
        System.out.println(stPt);
        System.out.print(stPt);
        for(int i = 0 ; i < map.size(); i++){
            System.out.print("->"+map.get(stPt));
            stPt = map.get(stPt);
        }
    }
}