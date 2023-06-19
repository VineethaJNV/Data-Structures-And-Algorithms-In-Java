public class RodCutting{
    /* Given a rod of length n inches and an array of prices that includes
         * prices of all pieces of size smaller than n. Determine the maximum value 
         * obtained by cutting up the rod and selling the pieces.
         */
    public static int rodCutting(int len[], int price[], int rodLength){
        int dp[][] = new int[len.length+1][rodLength+1];

        //intialization
        for(int i = 0 ;i < dp.length; i++){
            dp[0][i] = 0;
            dp[i][0] = 0;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(len[i-1] <= j){
                    if( i == 2 && j == 3){
                        int incProfit = price[i-1] + dp[i][j-len[i-1]];
                        System.out.println(price[i-1]+" price[i-1]");
                        System.out.println(dp[i][j-len[i-1]]+" dp[i][j-len[i-1]]");
                        System.out.print(incProfit+" ");
                    int excProfit = dp[i - 1][j];
                    System.out.print(excProfit+" ");
                    dp[i][j] = Math.max(incProfit, excProfit);
                    System.out.println(dp[i][j]);
                    }
                    int incProfit = price[i-1] + dp[i][j-len[i-1]];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printArr(dp);
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void printArr(int dp[][]){
        for(int i = 0 ; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int len[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;
        System.out.println(rodCutting(len, price, rodLength));
    }
}