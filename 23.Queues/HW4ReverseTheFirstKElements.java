import java.util.*;
public class HW4ReverseTheFirstKElements {
    /*We have an integer k and a queue of integers, we need to reverse the order 
    of the first k elements of the queue, leaving the other elements in the same relative 
    order */
    public static void reverseKElements(Queue<Integer>q, int k){
        Stack<Integer>s = new Stack<>();

        for(int i = 0 ; i < k; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        int k = 5;
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseKElements(q, k);
        // System.out.println(q);
        for(int i = 0 ; i < q.size() - k; i++){
            q.add(q.remove());
        }
        System.out.println(q);

        
        
    }
}
