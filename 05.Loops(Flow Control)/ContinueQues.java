import java.util.Scanner;
public class ContinueQues {
    // display all the numbers entered except the multiples of 10
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        }
    }
}
