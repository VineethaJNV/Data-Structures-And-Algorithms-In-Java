public class StringConversion {
    public static void findAddAndDelOp(String str1, String str2){
        int addOp = str1.length() - lcs(str1, str2);
        int delOp = str2.length() - lcs(str1, str2);

        System.out.println(addOp +" addition operations are required");
        System.out.println(delOp+" Deletion opeartions are required");
        return;
    }
    public static int lcs(String str1, String str2){
        //Create DP Array
        int dp[][] = new int[str1.length()+1][str2.length()+1];

        //intialization
        for(int i = 0 ; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        //Bottom up

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1]; 
    }
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        System.out.println(lcs(str1, str2));
        // System.out.println(findAddAndDelOp(str1, str2));
        findAddAndDelOp(str1, str2);
        
    }
}
