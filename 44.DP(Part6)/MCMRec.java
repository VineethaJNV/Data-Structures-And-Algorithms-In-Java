public class MCMRec{
    public static int matrixChainMulRec(int arr[], int i, int j){
        if(i == j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;

        for(int k = i; k <= j - 1; k++){
            int result1 = matrixChainMulRec(arr, i, k);
            int result2 = matrixChainMulRec(arr, k+1, j);
            int result3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = result1+result2+result3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println(matrixChainMulRec(arr, 1, arr.length-1));
    }
}