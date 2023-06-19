import java.util.Arrays;
import java.util.HashSet;

public class LIS {
    public static int longestIncreasingSubSequence(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int arr1[] = new int[set.size()];
        int k = 0;
        for(Integer i : set){
            arr1[k] = i;
            k++;
        }
        Arrays.sort(arr1);
        int dp[][] = new int[arr.length+1][arr1.length+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(arr[i-1] == arr1[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        printArr(dp);
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void printArr(int dp[][]){
            for(int i = 0 ; i < dp.length; i++){
                for(int j = 0; j < dp[0].length; j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        // int arr[] = {10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubSequence(arr));
    }
}
