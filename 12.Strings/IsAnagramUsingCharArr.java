import java.util.Arrays;
public class IsAnagramUsingCharArr {
    public static void isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            System.out.println("Two strings are not anagrams of each other");
        }
        char s1arr[] = new char[s1.length()];
        char s2arr[] = new char[s2.length()];

        for(int i = 0; i < s1.length(); i++){
            s1arr[i] = s1.charAt(i);
        }
        for(int i = 0; i < s2.length(); i++){
            s2arr[i] = s2.charAt(i);
        }
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        System.out.println(Arrays.equals(s1arr, s2arr));
    }
    public static void main(String[] args) {
        String str1 = "Heart";
        String str2 = "Earth";
        isAnagram(str1.toLowerCase(), str2.toLowerCase());


    }
}
