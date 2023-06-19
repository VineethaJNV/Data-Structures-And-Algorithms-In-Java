import java.util.Stack;
public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character>s = new Stack<>();
        for(int i = 0 ; i < str.length(); i++){
            char currChar = str.charAt(i);
            if((currChar == ')'||currChar == ']'||currChar == '}') && s.isEmpty()){
                return false;
            }else{
                if((currChar == '('||currChar == '['||currChar == '{')){
                    s.push(currChar);
                }if((currChar == ')'||currChar == ']'||currChar == '}')){
                    char top = s.peek();
                    if((currChar == ')' && top == '(')||
                    (currChar == ']' && top == '[')||
                    (currChar == '}' && top == '{')){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }
            
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        // String str = "(({[]})";
            String str = "(){}[]";
            // String str = "(]";
        System.out.println("Is the parenthesis valid?: "+isValid(str));
    }
}
