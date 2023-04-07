import java.util.Queue;
import java.util.LinkedList;
public class Interleave2HalvesOfQueue {
    public static void findInterleave(Queue<Integer>q1){ //TC =>O(n), SC => O(n)
        Queue<Integer>q2 = new LinkedList<>();
        int half = q1.size() / 2;

        for(int i = 0 ;  i< half; i++){
            q2.add(q1.remove());
        }
        // printQueue(q1);
        // printQueue(q2);

        while(! q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        // printQueue(q1);
        // printQueue(q2);
    }
    public static void printQueue(Queue<Integer>q){
        while(!q.isEmpty()){
            System.out.print(q.peek() +" ");
            q.remove();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        findInterleave(q);
        System.out.print("Interleaved queue is: ");
        printQueue(q);
        

    }
}
