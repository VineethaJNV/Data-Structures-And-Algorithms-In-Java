import java.util.Scanner;
public class SumOfNnatural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;

        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.out.println((n*(n+1))/2);
    }
}
