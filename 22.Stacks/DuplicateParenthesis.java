import java.util.Stack;
public class DuplicateParenthesis {//@Google, @Microsoft
    //Given a balanced expression, find if it contains duplicate parentheses or not.
    //A set of parentheses are duplicate if the same sub expression is surrounded by multiple parentheses
    //return true if it contains duplicate else return false
    public static boolean isDuplicate(String str){
        Stack<Character>s = new Stack<>();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch ==')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate
                }else{
                    s.pop(); //opening pair
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))"; //duplicate exists => true
        String str1 = "(a-b)" ; //no dunplicate => false
        System.out.println(isDuplicate(str1));
        
    }
}
