import java.util.*;
public class SubArraySumEqualToK {

    public static int findCountBruteforce(int arr[], int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i ; j < arr.length; j++){
                sum += arr[j];
                if( sum == k){
                    count++;
                }
                // System.out.println(sum + " "+ j);
            }
            
            // System.out.println("count "+count);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        // int arr[] = {1, 2, 3};
        int k = -10;
        System.out.println("Maximum su-arrays of the giev array with sum = "+k+" are "+findCountBruteforce(arr, k));

        HashMap<Integer, Integer>map = new HashMap<>(); 
        int sum = 0;
        map.put(0, 1);
        int ans = 0;
        for(int i = 0 ; i < arr.length; i++){ //O(n)
            sum += arr[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}
