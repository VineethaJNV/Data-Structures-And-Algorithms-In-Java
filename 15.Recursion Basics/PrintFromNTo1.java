public class PrintFromNTo1{

    public static void printNToOne(int n){
        if( n == 0){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }
    public static void main(String[] args) {
        printNToOne(10);
    }
}