public class UnboundedKnapSack {
    public static int unboundedKnapSack(int val[], int wt[],int W){
        int dp[][] = new int[val.length+1][W+1];
        //Intialization
        for(int i = 0 ; i  < dp.length; i++){
            for(int j = 0 ; j < dp[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(wt[i-1] <= j){
                    int ans1 = val[i-1] + dp[i][j-wt[i-1]];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        printArr(dp);
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void printArr(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(unboundedKnapSack(val, wt, W));
    }
}
