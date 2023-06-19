import java.util.HashSet;

public class LongestCommonSubString{
    public static void findSubStrings(String s1, HashSet<String> set){
        for(int i = 0; i < s1.length(); i++){
            for(int j = i + 1; j < s1.length()+1; j++){
                set.add(s1.substring(i, j));
                // System.out.println(s1.substring(i, j));
            }
        }
    }
    public static int findCommonSubStringLength(HashSet<String> set1, HashSet<String>set2){
        HashSet<String>result = new HashSet<>();
        for (String string : set1) {
            System.out.print(string+" ");
            System.out.print(set2.contains(string));
            System.out.println();
            if(set2.contains(string)){
                result.add(string);
            }
        }
        int lcs = 0;
        for (String string : result) {
            if(string.length() > lcs){
                lcs = string.length();
            }
        }
        return lcs;
    }
    public static void main(String[] args) {
        // String s1 = "ABCDE";
        // String s2 = "ABGCE";
        String s1 = "ABCDGH";
        String s2 = "ACDGHR";
        HashSet<String> set1 = new HashSet<>();
        findSubStrings(s1, set1);
        HashSet<String> set2 = new HashSet<>();
        System.out.println(set1);
        
        findSubStrings(s2, set2);
        System.out.println(set2);
        // System.out.println(set2);
       System.out.println("Longest Common Substring is of length: "+ findCommonSubStringLength(set1, set2));



    }
}