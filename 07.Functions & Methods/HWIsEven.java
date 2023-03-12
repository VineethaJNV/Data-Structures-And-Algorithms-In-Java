import java.util.Scanner;
public class HWIsEven {
    public static boolean isEven(int n){
        if(n % 2== 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check if it is even or not");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println(n +"is an even number");
        }else{
            System.out.println(n +"is not an even number");
        }
    }
}
