import java.util.Scanner;
public class HalfPyramidNum {
    /*
     *1
      12
      123
      1234
     */
    public static void main(String[] args){
        System.out.println('A');
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
