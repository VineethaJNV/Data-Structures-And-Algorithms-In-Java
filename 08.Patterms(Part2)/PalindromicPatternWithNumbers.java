import java.util.Scanner;
public class PalindromicPatternWithNumbers {
    public static void PalindromicPatternWithNumbers(int n){
        /*
         1
        212
       32123
      4321234
     543212345    
         */
        int spaces = 0;
        for(int i = 1; i <= n; i++){
            spaces = n-i;
            for(int k = 1; k <= spaces;k++){
                System.out.print(" ");
            }
            int value = i;
            for(int j = 1; j<= i; j++){
                System.out.print(value);
                value--;
            }
            int temp = 2;
            for(int l =1; l<= i-1; l++){
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sc.nextInt();
        PalindromicPatternWithNumbers(lines);
        
    }
    
}
