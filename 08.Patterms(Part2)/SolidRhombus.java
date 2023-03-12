import java.util.Scanner;
public class SolidRhombus {
    public static void SolidRhombus(int n){
        /*
              *****
             *****
            *****
           *****
          *****  
         */
        int spaces = 0;
        for(int i = 1; i <= n; i++){
            spaces = n -i;
            for(int k = 1; k <= spaces; k++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        SolidRhombus(lines);

    }
}
