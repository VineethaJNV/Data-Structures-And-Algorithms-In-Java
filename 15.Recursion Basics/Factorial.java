public class Factorial {
    public static int findFact(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        int fact = n * findFact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println((findFact(5)));
    }
}
