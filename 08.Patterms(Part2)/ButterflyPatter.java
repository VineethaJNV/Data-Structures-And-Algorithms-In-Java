import java.util.Scanner;
public class ButterflyPatter {
    public static void ButterflyPattern(int n){
        /*
*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
* * * * * * * *
* * *     * * *
* *         * *
*             * 
*/
        int spaces = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            spaces = (2*n)- 2*i;
            for(int k = 1; k <= spaces; k++){
                System.out.print("  ");
            }
            for(int  j= 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            spaces = (2*n)- 2*i;
            for(int k = 1; k <= spaces; k++){
                System.out.print("  ");
            }
            for(int  j= 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        ButterflyPattern(lines);

    }
}
