import java.util.Scanner;
public class HWSumOfTheDigitsInAIntegr {
    public static int calcDigitSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n/ 10;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate their digit sum:");
        int n = sc.nextInt();
        System.out.println("The sum of the digits is :"+calcDigitSum(n));
    }
}
