import java.util.PriorityQueue;

public class WeakestSoldier {
    /*We are given an m*n binary matrix of 1's(soldiers) and 0's(civilians)
     * The soldiers are positioned in front of the civilians. That is, all the 1's 
     * will appear to the left of all 0's in each row.
     * A row i is weaker than a row j if one of the following is true:
     * The number of soldiers in row i is leass than the numbe rof soldiers in row j
     * Both rows have the same number of soldiers and i < j
     * Find the K weakest rows
     */
    static class Info implements Comparable<Info>{
        int idx;
        int soldierCount;
        Info(int idx, int soldierCount){
            this.idx = idx;
            this.soldierCount = soldierCount;
        }
        @Override
        public int compareTo(Info i2){
            if(this.soldierCount == i2.soldierCount){
                return this.idx - i2.idx;
            }else{
                return this.soldierCount - i2.soldierCount;
            }
        }

    }
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int k = 2;
        int arr[][] = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        PriorityQueue<Info>pq = new PriorityQueue<>();
        for(int i = 0 ; i < arr.length; i++){
            int soldierCount = 0;
            for(int j = 0 ; j<  arr[0].length; j++){
                if(arr[i][j] == 1){
                    soldierCount++;
                }
            }
            pq.add(new Info(i, soldierCount));
        }
        System.out.println("the weakest" + k+" "+"rows are:");
        for(int i = 0 ; i < k; i++){
            System.out.println("Row"+pq.remove().idx);
        }
    }
}
