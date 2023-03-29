import java.util.Stack;
public class ValidPaenthesis {
    //Given a string containing character braces, determine if the input string is valid.
    //An input string is valid if:
    //1.Open braces must be closed by the same type of brackets
    //2.Open brackets must be closed in the correct order
    //3.Every closed bracket has a corresponding open bracket of the same type
    public static boolean isValid(String str){
        Stack<Character>s = new Stack<>();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek() == '('&& ch == ')'
                || s.peek() == '[' && ch ==']'
                || s.peek() == '{' && ch =='}'){
                    s.pop();
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "([{()])";
        System.out.println(isValid(str));
        
    }
}
