import java.util.Arrays;
public class LCSMemo {
    public static int findLCSMemo(String s1, int n, String s2, int m, int dp[][]){
        if(n < 0 || m < 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(s1.charAt(n) == s2.charAt(m)){
            dp[n][m] = findLCSMemo(s1, n-1, s2, m-1, dp)+1;
            return dp[n][m];
        }else{
            int ans1 = findLCSMemo(s1, n-1, s2, m, dp);
            int ans2 = findLCSMemo(s1, n, s2, m-1, dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
        
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "aceb";
        // String s1 = "abcdge";
        // String s2 = "abedg";
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i = 0 ; i  < dp.length; i++){
            for(int j = 0 ; j  < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(findLCSMemo(s1, s1.length()-1, s2, s2.length()-1, dp));

        for(int i = 0 ; i  < dp.length; i++){
            for(int j = 0 ; j  < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
