import java.util.Scanner;
public class BreakQues {
    public static void main(String [] args){
        //keep entering numbers until user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println("The number you entered is a multiple of 10, exiting now ....");
                break;
            }
        }
    }
}
