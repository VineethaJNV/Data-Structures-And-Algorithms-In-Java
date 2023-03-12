public class IsAnagram {
    //Determine if 2 Strings are anagrams of each other.
    //What are anagrams?
    //If two strings contain the same characters but in a different order,
    //they can be said to be anagrams.Consider "race" and "care".
    //In this case, race's characters can be formed into care & care'scharacters can be formed into race.
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s2);
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            for(int j = 0 ; j <sb.length(); j++){
                if(ch == sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }

        return sb.length() == 0;
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(isAnagram(str1,str2));
        
    }
}
