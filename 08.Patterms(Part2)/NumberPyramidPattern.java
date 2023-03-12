import java.util.Scanner;
public class NumberPyramidPattern {
    public static void NumberPyramidPattern(int n){
        /*
         1
        2 2 
       3 3 3
      4 4 4 4 
     5 5 5 5 5   
         */
        int spaces = 0;
        for(int i = 1; i <= n; i++){
            spaces = n-i;
            for(int k =1; k <= spaces; k++){
                System.out.print(" ");
            }
            for(int j =1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        NumberPyramidPattern(lines);
    }
    
}
