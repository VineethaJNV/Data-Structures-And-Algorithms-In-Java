public class BuyAndSellStocks {
    public static int findMaxProfit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(findMaxProfit(prices));

    }
}
