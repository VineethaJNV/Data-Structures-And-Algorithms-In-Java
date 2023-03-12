import java.util.HashMap;
import java.util.HashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class DuplicateTriplets {
    /* Given an integer array nums, return all the triplets [nums[i], nums[j], 
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets */
public static void findTriplets(int arr[]){

    HashSet<ArrayList>set = new HashSet<>();
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for(int i = 0; i < arr.length; i++){
        for(int j = i +1; j < arr.length; j++){
            for(int k = j+1; k < arr.length; k++){
                if((arr[i] + arr[j] + arr[k] == 0)){
                    ArrayList<Integer>list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    Collections.sort(list);
                    result.add(list);
                }
            }
        }
    }
    for(int i = 0; i < result.size(); i++){
        set.add(result.get(i));
    }
    System.out.println(set);
}

public static void main(String[] args){
    int arr[] = {-1, 0, 1, 2, -1, -4};
    findTriplets(arr);

}
    
}
