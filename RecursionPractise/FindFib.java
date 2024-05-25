public class FindFib {
    public static int findFib(int n){
        if(n == 0 || n ==1)
        {
            return n;
        }
        int fibnm1 = findFib(n-1);
        int fibnm2 = findFib(n-2);
        return fibnm1+fibnm2;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(findFib(n));
    }
}
