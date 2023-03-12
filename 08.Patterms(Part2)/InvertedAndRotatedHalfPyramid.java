import java.util.Scanner;
public class InvertedAndRotatedHalfPyramid {
    public static void InvertedAndRotatedHalfPyramid(int n){
        /*     *
              **
             ***
            ****  
         */
        for(int i = 1; i <= n; i++){
            int spaces = n-i;
            for(int k= 0; k < spaces; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        InvertedAndRotatedHalfPyramid(lines);

    }
}
