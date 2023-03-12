public class maxSubArrSumApproach2 {
    public static int maxSubArrSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = start == 0?prefix[end] : prefix[end] - prefix[start-1];
                maxSum = Math.max(maxSum, currSum);

            }
        }
        return maxSum;
    }
    public static void main(String [] args){
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println(maxSubArrSum(arr));
    }
}
