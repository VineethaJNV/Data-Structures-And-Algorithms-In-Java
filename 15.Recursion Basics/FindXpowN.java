public class FindXpowN {
    public static int findXpowN(int x, int n){
        if( n == 0){
            return 1;
        }
        int result = x * findXpowN(x, n-1);

        return result;
    }
    public static void main(String[] args) {
        System.out.println(findXpowN(2,10));
    }
}
