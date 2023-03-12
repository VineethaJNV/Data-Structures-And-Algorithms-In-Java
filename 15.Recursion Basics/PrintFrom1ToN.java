public class PrintFrom1ToN {
    // public static void printFromOneToN(int n, int i){
    //     if( i == n +1){
    //         return;
    //     }
    //     System.out.print(i +" ");
    //     printFromOneToN(n, i+1);
    // }
    public static void printFromOneToN(int n){
        if(n == 0){
            return;
        }
        printFromOneToN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printFromOneToN(10);
    }
}
