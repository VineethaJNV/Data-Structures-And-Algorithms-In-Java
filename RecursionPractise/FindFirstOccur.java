public class FindFirstOccur {
    public static int findFirstOccurence(int[] nums, int key,int i){
        if(i == nums.length ){
            return -1;
        }
        if(nums[i] == key){
            return i;
        }
        return findFirstOccurence(nums, key, i+1);

    }
    public static int findLastOccurence(int[] nums, int key,int i){
        if(i < 0 ){
            return -1;
        }
        if(nums[i] == key){
            return i;
        }
        return findFirstOccurence(nums, key, i-1);

    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 3, 4, 5, 6, 2, 3, 2, 1, 6};
        System.out.println(findLastOccurence(nums, 6, nums.length-1));
    }
}
