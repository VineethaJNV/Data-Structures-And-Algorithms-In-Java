

public class MaxMinSubArrSum {
    public static void findMaxMinSubArrSum(int arr[]){
        int prefixArr[]= new int[arr.length];
        prefixArr[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefixArr[i] = prefixArr[i-1]+arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
                maxSum = Math.max(sum, maxSum);
                minSum = Math.min(sum, minSum);
            }
        }
        System.out.println("Maximum sub array sum is : "+maxSum);
        System.out.println("Minimum sub array sum is : "+minSum);
    }
    public static void main(String[] args) {
        int arr[] = {34, 45, 56, 67, 78, -1};
        findMaxMinSubArrSum(arr);
    }
}
