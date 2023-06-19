import java.util.PriorityQueue;
public class ConnectNRopes {
    /*Given are N ropes of different lengths, the task is to connect these ropes with
     * minimum cost, such that the cost to connect teo ropes is equal to the sum of their lengths
     */
    public static void main(String[] args) {
        int ropes[] = {4, 3, 2, 6};
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0 ; i < ropes.length; i++){
            pq.add(ropes[i]);
        }
        System.out.println(pq);
        int minCost = 0;
        while(pq.size() > 1){
            int firstMin = pq.remove();
            int secondMin = pq.remove();
            int currCost = firstMin + secondMin;
            minCost += currCost;
            pq.add(currCost);
        }
        System.out.println("The minimum cost of connecting ropes is: "+minCost);
        
    }
}
