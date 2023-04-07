import java.util.*;
public class ImplementQueueUsingDeque {
    static class Queue{
        Deque<Integer>deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }
        public  int remove(){
            return deque.removeFirst();
        }
        public  int peek(){
            return deque.getFirst();
        }

        public boolean isEmpty(){
            return deque.isEmpty();

        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        
    }
    
}
