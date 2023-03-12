import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int factorial = 1;

        for(int i = 1; i <= input; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+input+" is: "+factorial);
        System.out.println(factorial(input));
    }
}
