import java.util.Scanner;
public class PrimeOrNot {
    // only for n >= 2
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        //boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){        // completely divide
                return false;
                // isPrime = false;
                // break;
            }
        }
        return true;
        //return isPrime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));




    }
}
