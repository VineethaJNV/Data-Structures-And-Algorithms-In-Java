public class MCMTab {
    public static int mcmTab(int arr[]){
        int dp[][] = new int[arr.length][arr.length];

        //Intialization
        for(int i = 0; i < dp.length; i++){
            dp[i][i] = 0;
        }
        
        //Bottom Up
        for(int len = 2; len <= dp.length-1; len++){
            for(int i = 1; i <= dp.length-len; i++){
                int j = i + len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i; k <= j - 1; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        printArr(dp);
        return dp[1][dp.length-1];
    }
    public static void printArr(int dp[][]){
        for(int i = 0 ; i  < dp.length; i ++){
            for(int j = 0 ; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3};
        System.out.println(mcmTab(arr));
    }
}
