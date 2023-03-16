public class gridWays {//O(2 pow(m+n))
    //Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.Allowed moves -right or down
    public static int gridWays(int n, int m, int i, int j){
        if(i == n-1 && j == m-1){
            return 1;
        }else  if(i == n || j == m){
            return 0;
        }
        int ways1 = gridWays(n, m, i+1, j);
        int ways2 = gridWays(n, m, i, j+1);
        return ways1+ways2;
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        System.out.println("Total number of possible ways are:"+gridWays(n, m, 0, 0));
    }
}
