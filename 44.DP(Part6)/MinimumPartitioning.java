public class MinimumPartitioning {
    public static int minPartition(int arr[]){

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int W = sum /2;
        int dp[][] = new int[arr.length+1][W+1];

        //intialization
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(arr[i-1] <= j){
                    int incProfit = arr[i-1] + dp[i-1][j-arr[i-1]];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[dp.length-1][dp[0].length-1];
        int sum2 = sum - sum1;
        System.out.println(sum2);
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        int num[] = {1, 6, 11, 5};
        System.out.println(minPartition(num));
    }
}
