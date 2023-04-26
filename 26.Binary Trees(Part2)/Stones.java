import java.util.*;

public class Stones {
    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < stones.length; i++){
            pq.add(stones[i]);
        }
 
        int count = pq.size();

        while(pq.size() > 1){
            int max1 = pq.remove();
            int max2 = pq.remove();
            if(max1 != max2){
                int diff = Math.abs(max1-max2);
                pq.add(diff);
            }
            System.out.println(pq);
        }
        System.out.println("At the end"+pq);
        


        
    }
}
