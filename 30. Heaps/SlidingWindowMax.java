import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMax {
    /*Maximum of all sub Arrays of Size K */
    static class Element implements Comparable<Element>{
        int value;
        int idx;
        Element(int value, int idx){
            this.value = value;
            this.idx = idx;
        }

        public int compareTo(Element e2){
            return this.value - e2.value;
        }
    }
    public static void main(String[] args) { // O(n log K)
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int result[] = new int[arr.length];
        PriorityQueue<Element> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < k; i++){
            pq.add(new Element(arr[i], i));
        }
        // System.out.print(pq.+" ");
        // result[0] = pq.peek().value;
        System.out.print(pq.peek().value+" ");
        for(int i = k; i < arr.length; i++){
            while(pq.size()>0 && pq.peek().idx <= (i - k) ){
                pq.remove();
            }
            pq.add(new Element(arr[i], i));
            System.out.print(pq.peek().value+" ");
        }
    }
}
