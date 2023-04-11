import java.util.Comparator;

import java.util.Arrays;
public class MaxLengthChainOfPairs {
    /* You are given N pairs of numbers . In every pair, the first number is always 
    samller than the second number, A pair (c,d) can come after pair(a,b) if b<c.
     * Find the longest chain which can be formed  from a given set of pairs.
     */
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60},{5,28},{27,40}, {50, 90}};
        // int pairs[][] = {{1,2}, {2,3}, {3,4}};

        // int ans = 3;

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        for(int i = 0 ; i < pairs.length; i++){
            for(int j = 0; j < pairs[0].length; j++){
                System.out.print(pairs[i][j]+" ");
            }
            System.out.println();
        }
        int maxChain = 0;

        int a = pairs[0][0];
        int b = pairs[0][1];
        maxChain = 1;

        for(int i = 1 ; i < pairs.length; i++){
            int c = pairs[i][0];
            int d = pairs[i][1];
            if(b < c){
                maxChain++;
                a = c;
                b = d;
            }

        }
        System.out.println(maxChain);
        
    }
}
