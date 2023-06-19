import java.util.Arrays;

public class minArrayJumps{
    public static int findMinJumps(int[] jumps){
        //Create a DP array of 1-D
        int dp[] = new int[jumps.length];

        //Intialization
        Arrays.fill(dp, -1);
        dp[dp.length-1] = 0;

        //Bottom Up => Small to large
        for(int i = dp.length-2; i >= 0; i--){
            int steps = jumps[i];
            int ans = Integer.MAX_VALUE;
            for(int j = i + 1; j <= i + steps && j < jumps.length; j++){
                if(dp[j] != -1){
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        for(int i = 0; i < dp.length; i++){
            System.out.print(dp[i]+" ");
        }
        
        return dp[0];
    }
    public static void main(String[] args) {
        int jumps[] = {2, 3, 1, 1,4}; 
        System.out.println(findMinJumps(jumps));

    }
}