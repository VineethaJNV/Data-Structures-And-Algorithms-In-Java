import java.util.Scanner;
public class BinCoeff {
    public static int calcFact(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value to calculate binomial coefficient:");
        int n = sc.nextInt();
        System.out.println("Enter r value to calculate binomial coefficient:");
        int r = sc.nextInt();
        int nFact = calcFact(n);
        int rFact = calcFact(r);
        int nMrFact = calcFact(n - r);
        int BinCoeff = nFact/(rFact*nMrFact);
        System.out.println(BinCoeff);
    }
}
