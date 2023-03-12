import java.util.Scanner;

public class PrimesInARange {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int  i =2; i < n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int start = sc.nextInt();
        System.out.println("Enter the ending range:");
        int end = sc.nextInt();

        for(int i = start; i < end; i++ ){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
