import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int n =10;
        int i = 0;
        while(i < n){
            int temp = sc.nextInt();
            if(temp % 2 == 0){
                evenSum += temp;
                System.out.println("even" + temp);
            }else{
                System.out.println("odd" + temp);
                oddSum += temp;
            }
            i++;
        }
        System.out.println("The sum of even numbers is: "+ evenSum);
        System.out.println("The sum of odd numbers is: "+ oddSum);
    }
}
