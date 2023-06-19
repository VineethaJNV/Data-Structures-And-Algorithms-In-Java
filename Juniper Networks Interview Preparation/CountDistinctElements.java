import java.util.*;
public class CountDistinctElements {
    public static int countUnique(int arr[]){
        HashSet<Integer>set = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println("The distinct elements in the given array are: "+countUnique(nums));
        
    }
}
