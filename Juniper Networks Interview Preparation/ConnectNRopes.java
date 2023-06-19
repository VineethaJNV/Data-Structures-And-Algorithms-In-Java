import java.util.*;
public class ConnectNRopes {
    public static void main(String[] args) {
        int ropes[] = {2, 3, 3, 4, 6};
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0 ; i < ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost = 0;
        System.out.println(pq);

        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            int currCost = min1+min2;
            cost += currCost;
            pq.add(currCost);
        }
        System.out.println("Minimum cost required to connect the ropes is = : "+cost);
    }
}
