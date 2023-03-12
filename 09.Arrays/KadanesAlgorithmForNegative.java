public class KadanesAlgorithmForNegative {
    public static int kadanesegativeSum(int arr[]){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                flag = false;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        if(flag){
            for(int i = 0; i < arr.length;i++){
                maxSum = Math.max(maxSum, arr[i]);
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] ={-15, -10, -100, -200, -23, -25, -2};
        System.out.println(kadanesegativeSum(arr));
    }
}
