import java.util.*;
public class FirstNonRepeatingLetter {
    public static void printFirstNonRepeating(String str, int freq[]){
        Queue<Character>q = new LinkedList<>();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(q.peek());
            }

        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        int freq[] = new int[26];
        Arrays.fill(freq,0);
        printFirstNonRepeating(str, freq);
    }
}
