import java.util.Scanner;
public class HWIsPalindrome {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int lastDigit = 0;
        int temp = n;
        while(n > 0){
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n /10;
        }
        return (temp == rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it a palindrome or not");
        int input = sc.nextInt();
        if(isPalindrome(input)){
            System.out.println(input +" is a palindrome");
        }else{
            System.out.println(input +" is not a palindrome");
        }


    }
}
