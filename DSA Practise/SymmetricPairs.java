import java.util.*;
public class SymmetricPairs {
    public static  ArrayList<ArrayList<Integer>> findSymmetricPairs(int[][] pairs){
        ArrayList<ArrayList<Integer>>pairsList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> symmetricPairs = new ArrayList<>();
        for(int i = 0; i < pairs.length; i++){
            ArrayList<Integer>pair = new ArrayList<>();
            int smaller = Math.min(pairs[i][0], pairs[i][1]);
            int greater = Math.max(pairs[i][0], pairs[i][1]);
            pair.add(smaller);
            pair.add(greater);
            if(!pairsList.isEmpty() && pairsList.contains(pair)){
                symmetricPairs.add(pair);
            }
            pairsList.add(pair);
            

        }
        return symmetricPairs;
    }
    public static void findSymmetric(int[][] pairs){

        for(int i = 0; i < pairs.length; i++){
            int[] ithPair = pairs[i];
            for(int j = i+1; j < pairs.length; j++){
                int[] jthPair = pairs[j];
                if(ithPair[0] == jthPair[1] && ithPair[1] == jthPair[0]){
                    System.out.print("["+jthPair[0]+","+jthPair[1]+"]"+" ");
                }

            }
        }
    }
    public static void main(String[] args) {
        int pairs[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        findSymmetric(pairs);
    }
}

// System.out.println(findSymmetricPairs(pairs));