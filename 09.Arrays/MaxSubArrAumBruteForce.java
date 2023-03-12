public class MaxSubArrAumBruteForce {
    public static int MaxSubArrSum(int arr[]){ // O(n^3)
        int maxSum = Integer.MIN_VALUE; // -Inifnity

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = 0;
                for(int k =i; k <= j; k++){
                    currSum += arr[k];
                }
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] = {1, -2, 6, -1,3};
        System.out.println("Maximum SubArray sum is:"+MaxSubArrSum(arr));
    }
}
