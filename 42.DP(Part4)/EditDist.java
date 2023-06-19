public class EditDist { //O(n*m)
    public static int EditDist(String str1, String str2){
        //Create DP array
        int dp[][] = new int[str1.length()+1][str2.length()+1];

        //Intialization
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                if(j == 0){
                    dp[i][j] = i;
                }
            }
        }

        //Bottom up
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1], dp[i-1][j]))+1;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) {
        String str1 = "intention";
        String str2 = "execution";
        System.out.println(EditDist(str1, str2));

    }
}
