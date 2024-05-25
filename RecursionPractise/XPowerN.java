public class XPowerN {
    public static int findXPowN(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*findXPowN(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(findXPowN(x, n));
    }
}
