import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public static boolean isUnique(int array[], ArrayList<int[]> result) {
        for(int i = 0; i < result.size(); i++) {
            if (result.get(i).equals(array)) {
                return false;
            }
        }
        return true;
    }
    public static void triplets(int nums[]) {
        int n = nums.length;
        int sum = 0;
        ArrayList<int[]> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    int array[] = {nums[i] + nums[j] + nums[k]};
                    Arrays.sort(array);
                    if (sum == 0 && isUnique(array, result) == true) {
                        result.add(array);
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        triplets(nums);
    }
}
