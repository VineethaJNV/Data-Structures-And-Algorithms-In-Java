public class Fibonacci{
    //Fib using Tabulation
    public static int fibTab(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int dp[] = new int[n+1]; //Intialization

        //Assign meaning
        dp[0] = 0;
        dp[1] = 1;
        //Start filling
        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    //Fib using Memoization
    public static int fibDP(int n, int fib[]){
        if(n == 0 || n == 1){
            fib[n] = n;
            return n;
        }
        if(fib[n] != 0){
            return fib[n];
        }
        fib[n] = fibDP(n - 1 , fib) + fibDP(n - 2, fib);
        return fib[n];
    }
    //Fib using For loop
    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }    
        int first = 0;
        int second = 1;
        int curr = 0;
       
        for(int i = 0 ; i < n; i++){
            curr = first + second;
            second = first;
            first = curr;
        }
        return curr;

    }
    //Fib using recursion
    public static int findFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnM1 = findFib(n - 1);
        int fibnM2 = findFib(n - 2);
        return fibnM1 + fibnM2;
    }
    public static void main(String[] args) {
        int n = 60;
        // System.out.println("Fibonacci using For loop");
        // for(int i = 0 ; i  < n; i++){
        //     System.out.print(printFib(i)+" ");
        // }
        int fib[] = new int[n+1];
        System.out.println("\nFib using DP");
        for(int i = 0; i < n; i++){
           System.out.print(fibDP(i, fib)+" ");
        }
        System.out.println("\nFib using Tabulation");
        for(int i = 0; i < n; i++){
            System.out.print(fibTab(i)+" ");
        }
         System.out.println("\nFibonacci using Recursion: ");
        for(int i = 0 ; i < n; i++){
            System.out.print(findFib(i)+" ");
        }
    }
}