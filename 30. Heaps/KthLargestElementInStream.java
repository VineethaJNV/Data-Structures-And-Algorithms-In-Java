import java.util.*;
public class KthLargestElementInStream {
    public static ArrayList<Integer> getKthLargestElement(int arr[], int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        ArrayList<Integer>result = new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){
            int curr = arr[i];
            if(pq.size() < k){
                pq.add(curr);
                System.out.println("pq in if"+pq);
            }else{
                if(curr > pq.peek()){
                    pq.poll();
                    pq.add(curr);
                    System.out.println("pq in else - if"+pq);
                }
            }
            if(pq.size() >= k){
                result.add(pq.peek());
                System.out.println(" result in if"+result);
            }else{
                result.add(-1);
                System.out.println(" result in else"+result);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int stream[] = {10, 20, 11, 70, 50, 40, 100, 5};
        int k = 3;
       
        ArrayList<Integer> result = getKthLargestElement(stream, k);
        System.out.println(result);
        
    }
}
