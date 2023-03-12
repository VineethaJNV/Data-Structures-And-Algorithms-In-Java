import java.util.Scanner;
public class isPrime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int inputNum = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < inputNum; i++){
            if(inputNum % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("The given number is prime number");
        }else{
            System.out.println("The given number is not prime");
        }
    }
}
