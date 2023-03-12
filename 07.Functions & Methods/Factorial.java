import java.util.Scanner;
public class Factorial {
    public static int findFact(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial");
        int n = sc.nextInt();
        System.out.println(findFact(n));
    }
}
