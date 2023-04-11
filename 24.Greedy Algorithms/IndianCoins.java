import java.util.*;
public class IndianCoins {
    /*We are given an infinite supply of denominations [1,2,5,10, 20, 50, 100, 500, 2000] 
     * Find minimum number of notes /coins to make change for V
    */
    public static void main(String[] args) {
        Integer coins[] ={1,2,5,10,20, 50, 100, 500, 2000};
        //sort the array in descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 590;
        int countOfCoins = 0;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0 ; i < coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    list.add(coins[i]);
                    amount -= coins[i];
                    countOfCoins++;
                }
            }
        }
        System.out.println("Total min coins used: "+countOfCoins);
        System.out.println(list);

        // int V=121,ans = 121;
        // for(int i = arr.length -1; i >= 0 && V > 0; i--){
        //     ans+=V/arr[i];
        //     V = V%arr[i];
        // }
        // System.out.println(ans);


        
    }
}
