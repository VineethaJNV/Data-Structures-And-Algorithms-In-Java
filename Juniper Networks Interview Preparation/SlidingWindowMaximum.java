import java.util.*;
public class SlidingWindowMaximum {
    static class Element implements Comparable<Element>{
        int val;
        int idx;
        Element(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Element e2){
            return e2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int result[] = new int[arr.length-k+1];
        PriorityQueue<Element>pq = new PriorityQueue<>();
       
        for(int i = 0 ; i < k; i++){
            pq.add(new Element(arr[i], i));
        }
        result[0] = pq.peek().val;
        int j = 1;
        for(int i = k; i < arr.length; i++){
            while(pq.peek().idx <= i - k){
                pq.remove();
            }
            pq.add(new Element(arr[i], i));
            result[j] = pq.peek().val;
            j++;
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }


        
    }
}
