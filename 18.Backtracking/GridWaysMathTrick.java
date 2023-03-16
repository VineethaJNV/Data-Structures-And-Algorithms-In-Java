public class GridWaysMathTrick {
    public static int calcFact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int gridWaysMath(int n, int m){
        int ways = calcFact((n-1 + m-1)) / (calcFact(n-1) * calcFact(m-1));
        return ways;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println("all possible ways in grid are:"+gridWaysMath(n, m));

    }
}
