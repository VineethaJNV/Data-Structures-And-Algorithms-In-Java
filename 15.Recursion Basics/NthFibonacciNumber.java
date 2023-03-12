public class NthFibonacciNumber {
    public static int findNthFib(int n){
        if( n == 0 || n == 1){
            return n;
        }
        int fib = findNthFib(n-1) + findNthFib(n-2);

        return fib;
    }
    public static void main(String[] args) {
        System.out.println(findNthFib(6));
    }
}
