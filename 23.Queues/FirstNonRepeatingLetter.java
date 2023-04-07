import java.util.Queue;
import java.util.LinkedList;
public class FirstNonRepeatingLetter { //O(n) =>Stream of characters => Queue 
    /*First non repeating letter in a stram of lower case characters */

    public static void findFirstNonRepeatingLetter(String str){
        int map[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            map[ch - 'a']++;
            

            while(! q.isEmpty() && map[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(q.peek()+" ");
            }

        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        findFirstNonRepeatingLetter(str);
    }

}
