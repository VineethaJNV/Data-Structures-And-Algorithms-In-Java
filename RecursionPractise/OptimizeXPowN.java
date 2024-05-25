public class OptimizeXPowN {
    public static int findPow(int x, int n){
        System.out.println("n : "+n);
        if(n == 0){
            return 1;
        }
        
        int xPowNByTwo = findPow(x, n/2);
        if(n % 2 == 0){
            return xPowNByTwo*xPowNByTwo;
        }else{
            return x*xPowNByTwo*xPowNByTwo;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(findPow(x, n));
    }
}
