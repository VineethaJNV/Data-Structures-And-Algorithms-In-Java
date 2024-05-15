import java.util.*;
public class StackImplementationJCF {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
