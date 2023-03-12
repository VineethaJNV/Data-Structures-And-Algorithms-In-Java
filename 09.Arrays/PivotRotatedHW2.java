public class PivotRotatedHW2 {
    /* There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexit */
public static int variationOfBinarySearch(int arr[], int target){
    //find pivot index
    int pivotIndex = 0;
    for(int i = 0; i < arr.length-1;i++){
        if(arr[i] > arr[i+1]){
            pivotIndex = i;
        }
    }
    return pivotIndex;
}
public static void main(String[] args){
    int arr[] = {4,5,6,7,0,1,2}; // 4
    int target = 0;
    int arr1[] = {4,5,6,7,0,1,2}; // -1
    int target2  = 3;
    int arr2[] = {1}; // -1
    int target3 = 0;
    int arr3[] = {30, 40, 50, 10, 20};
    System.out.println(variationOfBinarySearch(arr3,0));
}
}
