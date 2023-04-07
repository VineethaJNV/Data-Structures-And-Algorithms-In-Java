import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class HW2ConnectNRopesWithMinimumCost{
    /*Given are N ropes of different lengths,the task is to connect these ropes into one rope with minimum 
    cost, such that the cost to connect two ropes is equal to the sum of their lengths */
    public static int findMinCost(int n, int[] lengths){
        Queue<Integer>q = new LinkedList<>();
        Arrays.sort(lengths);
        int minCost = 0;
       for(int i = 0 ; i < lengths.length; i++){
            q.add(lengths[i]);
       }

        int rope1 = q.remove();
        int rope2 = q.remove();
        int currCost = rope1+rope2;
        minCost = currCost;
       while(!q.isEmpty()){
        currCost += q.remove();
        minCost += currCost;
        
       }
       return minCost;

       

    }
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {4,3,2,6}; //o/p = >29
        System.out.println("the minimum cost to connect the ropes is: "+findMinCost(n, arr));
        
    }
}