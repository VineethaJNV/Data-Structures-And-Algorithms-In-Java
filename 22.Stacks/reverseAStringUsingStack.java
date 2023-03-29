import java.util.Stack;
public class reverseAStringUsingStack {
    public static String reverseStr(Stack<Character>s, String str){
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            s.push(ch);
        }
        String result = "";
        while( ! s.isEmpty()){
            result+=s.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        Stack<Character>s = new Stack<>();
        String str = "vineetha";
        System.out.println(reverseStr(s, str));
    }
}
