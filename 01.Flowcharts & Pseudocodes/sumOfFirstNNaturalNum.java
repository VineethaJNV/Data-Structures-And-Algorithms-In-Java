import java.util.Scanner;
public class sumOfFirstNNaturalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum of first"+n+"natural numbers is"+sum);
        System.out.println("formula"+(n*(n+1))/2);
    }
}
