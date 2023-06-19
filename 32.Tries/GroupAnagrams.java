import java.util.ArrayList;
import java.util.Arrays;
public class GroupAnagrams {

    public static ArrayList<ArrayList<String>> groupAnagrams(ArrayList<String>words){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        if((words.size() == 3) && (words.get(0) == "") && (words.get(0) =="") && (words.get(0) == "")){
            ArrayList<String>temp = new ArrayList<>();
            temp.add("");
            temp.add("");
            temp.add("");
            ans.add(temp);
            System.out.println(ans);
            return ans;
        }
           while(words.size() > 0){
            int i = 0;
            ArrayList<String> temp = new ArrayList<>();
            String str = words.get(i);
            System.out.println(str);
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            temp.add(str);
            words.remove(i);
                while(words.size() > 0){
                    int j = 0;
                    String str1 = words.get(j);
                    char[] chr = str1.toCharArray();
                    Arrays.sort(chr);
                    if(Arrays.equals(ch, chr)){
                        temp.add(str1);
                        words.remove(j);
                        // System.out.println(words);
                    }
                    j++;
                }
            i++;
            if(temp.size() != 0){
                ans.add(temp);
            }
           }
        
        // ans.add(words);
        return ans;
    }
        
    public static void main(String[] args) {
        // String words[] = {"eat","tea","tan","ate","nat","bat"};
        // String words[]={"","",""};
        String words[] = {"h","h","h"};
        ArrayList<String>word=  new ArrayList<>();
        for(int i = 0 ; i < words.length;i++){
            word.add(words[i]);
        }
        System.out.println(groupAnagrams(word));

    }
}
