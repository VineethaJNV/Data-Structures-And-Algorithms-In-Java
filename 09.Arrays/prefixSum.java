public class prefixSum {
    public static int prefixSum(int arr[]){ //O(n^2)
        int prefixArr[] = new int[arr.length];
        prefixArr[0] = arr[0];
        int maxSubArrSum = 0;
        // for(int i = 1; i < arr.length; i++){
        //     for(int j = 0; j <= i; j++){
        //         prefixArr[i] += arr[j];
        //     }
        // }
        for(int i = 1; i< arr.length; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        // for(int i = 0; i < prefixArr.length;i++){
        //     System.out.print(prefixArr[i]+" ");
        // }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = start == 0 ?prefixArr[end]: prefixArr[end] - prefixArr[start - 1]; 
                //One statement always takes less time when compared to a loop
                maxSubArrSum = Math.max(maxSubArrSum, currSum); 
            }
           
        }
        return maxSubArrSum;
    }
    public static void main(String[] args){
        int arr[] = {1, -2, 6, -1, 3};
         System.out.print(prefixSum(arr));
    }
}
