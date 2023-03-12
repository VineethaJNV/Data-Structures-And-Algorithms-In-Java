public class KadanesAlgorithm {
    public static int kadanesSum(int arr[]){//O(n)  It will give 0 as sum if there are all negative numbers. A special case is needed to check if there are all negative numbers, if yes, return the smallest negative number.
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            // if(currSum + arr[i] > 0){
            //     currSum += arr[i];
            // }else if(currSum+arr[i] < 0){
            //     currSum = 0;
            // }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadanesSum(arr));

    }
    
}
