import java.util.*;
public class LargestSubArrayWithZeroSum {

    public static int findLargest(int arr[]){ //O(n)
        boolean flag = false;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < 0){
                flag = true;
                break;
            }
        }
        if(flag == false){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            int temp = 0;
            sum += arr[i];
            if(map.isEmpty()){
                map.put(sum, i);
            }else{
                if(map.containsKey(sum)){
                    temp = i - map.get(sum);
                }else{
                    map.put(sum, i);
                }
            }
            largest = Math.max(largest, temp);
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        // int arr[] = {3, 4, 5};
        System.out.println("Largest subarray with 0 sum has length of: "+findLargest(arr));
    }
}
