import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args){
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int bigger = 0;

        if(a > b && a > c){
            bigger = a;
        }else if(b > a && b > c){
            bigger = b;
        }else{
            bigger = c;
        }
        System.out.println("\n"+bigger);
    }
}
