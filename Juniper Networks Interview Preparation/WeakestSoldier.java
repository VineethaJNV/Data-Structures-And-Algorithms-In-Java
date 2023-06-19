import java.util.*;
public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int soldierCount;
        int idx;
        public Row(int soldierCount, int idx){
            this.soldierCount = soldierCount;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldierCount == r2.soldierCount){
                return this.idx - r2.idx;
            }else{
                return this.soldierCount - r2.soldierCount;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0,},
                        {1,0,0,0}};
        int k = 2;
        PriorityQueue<Row>pq = new PriorityQueue<>();
        for(int i = 0 ; i< army.length; i++){
            int soldierCount = 0;
            for(int j = 0; j < army[0].length;j++){
                if(army[i][j] == 1){
                    soldierCount++;
                }
            }
            pq.add(new Row(soldierCount, i));
        }
        for(int j = 0; j < k; j++){
            System.out.println("row"+" "+pq.remove().idx);
        }
    }
}
