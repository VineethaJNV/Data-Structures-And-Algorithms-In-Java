public class ZeroOneKnapsack{
    public static int findMaxProfit(int val[], int wt[], int W, int ans, int i){
        if(W <= 0 || i >= val.length){
            return 0;
        }
        
        if(wt[i] <= W){
            int ans1 = val[i] + findMaxProfit(val, wt, W - wt[i], ans + val[i], i+1);
            int ans2 = findMaxProfit(val, wt, W, ans, i+1);
            return Math.max(ans1, ans2);
        }else{
            return findMaxProfit(val, wt, W, ans, i + 1);
        }

    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int ans = 0;
        System.out.println(findMaxProfit(val, wt, W, ans, 0));
    }
}