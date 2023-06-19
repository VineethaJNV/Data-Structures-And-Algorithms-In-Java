public class ClimbingStairs {
    //Using Tabulation
    public static int countWaysTab(int n, int dp[]){
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
    //Using Memoization
    public static int countWaysMemo(int n, int dp[]){
        if( n < 0){
            return 0;
        }
        if(n == 0){
            dp[n] = 1;
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = countWaysMemo(n-1, dp) + countWaysMemo(n-2, dp);
        return dp[n];
    }
    //using recursion
    public static int findWays(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return findWays(n-1) + findWays(n-2);
    }
    public static void main(String[] args) {
        int n = 45;
        
        int dp[] = new int[n+1];
        System.out.println("Memoization  "+countWaysMemo(n, dp));
        int dp1[] = new int[n+1];
        System.out.println("Tabulation "+countWaysTab(n, dp1));
        System.out.println("Recursion "+findWays(n));
    }
}
