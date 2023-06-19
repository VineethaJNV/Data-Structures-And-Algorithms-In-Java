public class CatalanTab {
    public static int findCatalanTab(int n){
        //step 1 => Create A DP Array
        int dp[] = new int[n+1];

        //Step2 => Intialization
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        for(int i = 0; i < dp.length; i++){
            System.out.print(dp[i]+" ");
        }
        System.out.println();
        return dp[n];

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findCatalanTab(n));
        
    }
}
