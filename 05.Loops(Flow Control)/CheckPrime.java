import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                counter++; 
            }
        }
        if(counter == 0){
            System.out.println("is a prime number");
        }else{
            System.out.println("is not a prime");
        }
    }
}
