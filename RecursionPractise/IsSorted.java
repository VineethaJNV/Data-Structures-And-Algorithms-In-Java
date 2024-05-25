public class IsSorted {
    public static boolean isArrSorted(int[] nums, int i){
        if(i == nums.length - 1){
            return true;
        }
        return nums[i] < nums[i+1] && isArrSorted(nums, i+1);
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4,5,6, 7, 0};
        System.out.println(isArrSorted(nums, 0));
    }
}
