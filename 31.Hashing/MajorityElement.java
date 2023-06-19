import java.util.*;
public class MajorityElement {
    /*Given an integer array of size n, find all elements that appear more than [n/3] times */
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){ //O(N)
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i], hm.get(arr[i])+1);
            // }else{
            //     hm.put(arr[i], 1);
            // }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Printing Hash map"+hm);
        Set<Integer> keys = hm.keySet();
        for (Integer k : keys) {
            if(hm.get(k) > Math.floor(arr.length / 3)){
                System.out.println("This key occured more than "+Math.floor(arr.length / 3)+" times"+" "+ k);
            }
        }
        

    }
}
