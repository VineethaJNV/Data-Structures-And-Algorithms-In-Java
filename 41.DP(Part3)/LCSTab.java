public class LCSTab {
    public static int findLCSTab(String str1, int n, String str2, int m){
        int dp[][] = new int[str1.length()+1][str2.length()+1];

        //Intialization
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        for(int i = 0 ; i  < dp.length; i++){
            for(int j = 0 ; j  < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(findLCSTab(str1, str1.length(), str2, str2.length()));

    }
}
