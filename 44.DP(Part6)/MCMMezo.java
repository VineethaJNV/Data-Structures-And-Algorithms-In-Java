public class MCMMezo {
    public static int matrixChainMulMemo(int arr[], int i, int j, int dp[][]){
        if(i == j){
            dp[i][j] = 0;
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int minCost = Integer.MAX_VALUE;

        int sample = 1;
        for(int k = i; k <= j - 1; k++){
            System.out.println(sample+" iteration");
            System.out.println("i "+i+" j "+j+" k "+k);
            int result1 = matrixChainMulMemo(arr, i, k, dp);
            int result2 = matrixChainMulMemo(arr, k+1, j, dp);
            int result3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = result1+result2+result3;
            minCost = Math.min(finalCost, minCost);
            dp[i][j] = finalCost;
            sample++;
        }
        

        
        return minCost;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int dp[][] = new int[arr.length][arr.length];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(matrixChainMulMemo(arr, 1, arr.length-1, dp));
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
