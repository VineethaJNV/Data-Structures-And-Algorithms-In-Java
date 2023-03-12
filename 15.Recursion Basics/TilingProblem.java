public class TilingProblem {
    //Given a "2 * N" board and tiles of size "2 * 1", count the number of 
    //ways to tile the given board using the "2 * 1" tiles.
    //(A tile can be placed either vertically or horizontally)
    public static int tiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int verticalWays = tiling(n-1);

        //horizontal ways
        int horizontal = tiling( n-2);

        return verticalWays+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
