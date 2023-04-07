import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class QueueReversal {
    public static void reverseQueue(Queue<Integer>q){ //T.C => O(n), S.C =>O(n)
        Stack<Integer>s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println("Original Queue is: ");
        // while(!q.isEmpty()){
        //     System.out.print(q.remove()+" ");
        // }
        // System.out.println();
        reverseQueue(q);
        System.out.println("reversed Queue is: ");
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
