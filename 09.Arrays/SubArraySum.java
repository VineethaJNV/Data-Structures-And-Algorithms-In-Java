public class SubArraySum {
    public static void subArrSum(int arr[]){
        int maxSubSum = Integer.MIN_VALUE;
        int minSubSum = Integer.MAX_VALUE;
        for(int i= 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                maxSubSum = Math.max(maxSubSum, sum);
                minSubSum = Math.min(minSubSum, sum);
                System.out.print(sum +" ");
            }
        }
        System.out.println("\nMaximum SubArr Sum is : "+ maxSubSum);
        System.out.println("Mininmum subarray sum is : "+minSubSum);
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        subArrSum(arr);
    }
}
