import java.util.Stack;
public class PushAtBottomOfStack {
    public static void pushAtBottom(Stack<Integer>s, int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, val);
        s.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int val = 4;

        pushAtBottom(s, val);
        System.out.println("Function called");
        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println();


        
    }
}
