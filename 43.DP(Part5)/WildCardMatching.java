public class WildCardMatching{
    public static boolean isMatch(String s,String p){
        // create Dp Array
        boolean [][]dp=new boolean[s.length()+1][p.length()+1];

        // Initialization of Dp Array
        dp[0][0]=true;

        for(int i=1;i<dp.length;i++){
            dp[i][0]=false;
        }
        for(int i=1;i<dp[0].length;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-1];
            }
            else{
                dp[0][i]=false;
            }
        }
        // bottom up or tabulation 

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];
                }
                else{
                    dp[i][j]=false;

                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) {
        // String str1="baaabab";
        // String str2="*****ba*****ab";
        String str1="baaabab";
        String str2="*a*ab??";

        System.out.println(isMatch(str1, str2));

    }
}