import java.util.*;

public class SortByFreq {
    /*Given a string s, sort it in decreasing order based on the frequency of the characters. The
frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them. */
    public static String sortByFreq(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>>pq = new PriorityQueue<>((a, b)->a.getValue() == b.getValue()?a.getKey()-b.getKey():b.getValue() - a.getValue());

        for(Map.Entry<Character, Integer> e: map.entrySet()){
            pq.add(e);
        }
        StringBuilder result = new StringBuilder();
        while(! pq.isEmpty()){
            char ch = pq.poll().getKey();
            int val = map.get(ch);
            while( val != 0){
                result.append(ch);
                val--;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        // String str = "cccaaa";
        String str1 = "tree";
        System.out.println(sortByFreq(str1));
    }
}
