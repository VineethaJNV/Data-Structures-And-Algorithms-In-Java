import java.util.Scanner;
public class DiamondPattern {
    public static void DiamondPattern(int n){
        /*
         * 
        ***
       *****
      *******
      ******* 
       *****
        ***
         * 
         */
        int spaces = 0;
        for(int i = 1; i <= n; i++){
            spaces = n -i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            spaces = n -i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        DiamondPattern(lines);
       
    }
    
}
