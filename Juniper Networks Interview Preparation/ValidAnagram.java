import java.util.*;
public class ValidAnagram {
    /*Given 2 stringss and t, return true, if t is an anagaram of s, and false otherwise
     * An anagram is a word or phrase formed by rearranging the letters of different word
     *  or phrase, typically using all the original letters exactly once
     */
    public static boolean isAnagram(String str1, String str2){//O(n)
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < str1.length(); i++){
            char ch = str1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            if(map1.containsKey(ch)){
                if(map1.get(ch) == 1){
                    map1.remove(ch);
                }else{
                    map1.put(ch, map1.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return map1.isEmpty();
        // for(int i = 0 ; i < str2.length(); i++){
        //     char ch = str2.charAt(i);
        //     map2.put(ch, map2.getOrDefault(ch, 0)+1);
        // }
        // return map1.equals(map2);
    }
    public static void main(String[] args) {
        // String s1 = "race";
        // String s2 = "care";
        // String s1 = "tulip";
        // String s2 = "lipid";
        String s1 = "heart";
        String s2 = "earth";
        System.out.println(isAnagram(s1, s2));
        
    }
}
