import java.util.*;
public class TwoSum {
    /*Two Sum
Given an array of integers arr[ ]and an integer target, return indices of the two numbers such
that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the
same element twice.
You can return the answer in any order */
    public static ArrayList<Integer> findTwoSum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int key = target - arr[i];
            if(map.containsKey(arr[i])){
                result.add(map.get(arr[i]));
                result.add(i);
            }else{
                map.put(key, i);
            }
        }
        System.out.println(map);
        return result;
    }
public static void main(String[] args) {
    // int arr[] ={2, 7, 11, 15};
    // int target = 9;
    int arr[] = {3, 2, 4};
    int target = 6;
    ArrayList<Integer>result = findTwoSum(arr, target);
    System.out.println(result);
}
}
