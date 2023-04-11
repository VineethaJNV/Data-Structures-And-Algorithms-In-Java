import java.util.*;
public class FKnapSack {
    //Given the weights and Values of N itmes, put these items in a knapsack
    // of capacity W to get the maximum total value in the knapsack
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th column => idx, 1st column => ratio

        for(int i = 0 ; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }
        // for(int i = 0 ; i < ratio.length; i++){
        //     for(int j = 0 ; j < ratio[0].length; j++){
        //         System.out.print(ratio[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int maxTotValue = 0;
        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int) ratio[i][0];
            if(W >= weight[idx]){ //include
                maxTotValue += val[idx];
                W -= weight[idx];
            }
            else{
                //include fractional item
                maxTotValue += (W * ratio[i][1]);
                W = 0;
                break;
            }
            
        }
        System.out.println("Max total value achieved is:"+maxTotValue);   
    }
}