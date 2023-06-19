import java.util.*;
public class PQInJcf{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3); //O(log n)
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(7);

        while(! pq.isEmpty()){
            System.out.print(pq.remove()+" ");//O(log n)
        }
    }
}