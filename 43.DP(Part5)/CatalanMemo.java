import java.util.Arrays;

public class CatalanMemo {
    public static int findCatalan(int n, int dp[]){
        if( n == 0 || n == 1){
            dp[n] = 1;
            return dp[n];
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;

        for(int i = 0; i < n; i++){
            ans+= findCatalan(i, dp) * findCatalan(n-i-1, dp);
            dp[n] = ans;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 15;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(findCatalan(n, dp));
    }
}
