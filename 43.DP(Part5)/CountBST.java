public class CountBST {
    public static int countBST(int n){
        //create dp array
        int dp[] = new int[n+1];

        //intialization
        dp[0] = 1;
        dp[1] = 1;

        //bottom up
        for(int i = 2; i <dp.length; i++){
            for(int j = 0; j < i; j++){
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += right*left;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("No of BST's that can be formed are :"+countBST(n));
    }
}
