import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TopKFrequentElements {
    static class Pair implements Comparable<Pair>{
        int key;
        int freq;

        public Pair(int key, int freq){
            this.key = key;
            this.freq = freq;
        }
        public int compareTo(Pair p2){
            return p2.freq - this.freq;
        }
    }
    public static void topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int result[] = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(Integer key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }
        
        int i = 0;
        while(i != k){
            result[i] = pq.remove().key;
            i++;
        }
        System.out.println("printing HashMap: " + map);
        System.out.println("printing PQ: " + pq);
        for(int j = 0 ; j < result.length; j++){
            System.out.print(result[j]+" ");
        }
        return ;
    }
    public static void main(String[] args) {
        int nums[] = {1,2};
        topKFrequent(nums, 2);
    }
}
