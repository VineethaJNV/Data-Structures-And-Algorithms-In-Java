import java.util.Scanner;
public class ZeroOneTraingle {
    public static void ZeroOneTraingle(int n){
        /* 1
           0 1
           1 0 1
           0 1 0 1 
           1 0 1 0 1
         */
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }if((i+j) % 2 == 1){
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        ZeroOneTraingle(lines);
    }
}
