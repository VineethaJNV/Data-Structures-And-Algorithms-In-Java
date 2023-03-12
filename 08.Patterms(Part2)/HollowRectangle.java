import java.util.Scanner;
public class HollowRectangle{
    public static void pattern(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <m ; j++){
                if( i == 0 || j ==0 || i == n-1 || j == m-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        pattern(n,m);
    }
}