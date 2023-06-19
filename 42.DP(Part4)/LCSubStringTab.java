public class LCSubStringTab {
    public static int findLCSubString(String s1, String s2){
        int dp[][] = new int[s1.length()+1][s2.length()+1];

        for(int i = 0; i < dp.length; i ++){
            for(int j = 0; j < dp[0].length;j++){
                if(i == 0 || j== 0){
                    dp[i][j] = 0;
                }
            }
        }
        int ans = 0;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < dp.length; i ++){
            for(int j = 0; j < dp[0].length;j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        return ans;
    }
    public static void main(String[] args) {
        // String str1 = "ABCDGH";
        // String str2 = "ACDGHR";
        // String str1 = "ABCDE";
        // String str2 = "ABGCE";
        String str1 = "aaa";
        String str2 = "aaaaaaa";
        System.out.println(findLCSubString(str1, str2));
    }
}
