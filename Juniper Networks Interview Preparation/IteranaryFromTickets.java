import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class IteranaryFromTickets {
    public static String getStart(HashMap<String, String>tickets){
        HashMap<String, String> revMap = new HashMap<>();
        for(String ticket:tickets.keySet()){
            revMap.put(tickets.get(ticket), ticket);
        }
        String startPt = "";
        for (String ticket : tickets.keySet()) {
            if(! revMap.containsKey(ticket)){
                startPt = ticket;
            }
        }
        return startPt;
       
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bangalore");
        map.put("Mumbai", "Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi", "Goa");
       System.out.print(getStart(map));
       String start = getStart(map);
       for(String key : map.keySet()){
        System.out.print("->"+map.get(start));
        start = map.get(start);
       }
       System.out.println();
    }
}
