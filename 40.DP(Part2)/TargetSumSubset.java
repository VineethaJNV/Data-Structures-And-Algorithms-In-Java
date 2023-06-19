public class TargetSumSubset {
    public static boolean targetSumSubSetTab(int num[], int sum){
        boolean dp[][] = new boolean[num.length+1][sum+1];

        for(int i = 0; i < dp.length; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                //include
                if(num[i - 1] <= j && dp[i-1][j-num[i-1]] == true){
                    dp[i][j] = true;
                }//exculde
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];

    }
    public static void main(String[] args) {
        int num[]= {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println(targetSumSubSetTab(num, sum));

    }
}
