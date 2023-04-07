import java.util.*;
public class ImplementStackUsingDeque {
    static class Stack{
        Deque<Integer>deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
        public boolean isEmpty(){
            return deque.isEmpty();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
