import java.util.Scanner;
public class PosOrNegHW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input >=0){
            System.out.println("NUmber is positive");
        }else{
            System.out.println("number is negative");
        }
    }
}
