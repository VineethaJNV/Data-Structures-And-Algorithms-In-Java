public class TilingProb {
    public static int findWaysToTile(int n){
        if(n == 0 || n == 1 ){
            return 1;
        }
        int verWays = findWaysToTile(n-1);
        int horWays = findWaysToTile(n-2);

        return verWays + horWays;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findWaysToTile(n));
    }
}
