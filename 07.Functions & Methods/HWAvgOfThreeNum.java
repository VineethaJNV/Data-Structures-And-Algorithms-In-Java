import java.util.Scanner;
public class HWAvgOfThreeNum {
    public static int findAvg(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nums to calculate their average:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average is:"+findAvg(a, b, c));
    }
}
