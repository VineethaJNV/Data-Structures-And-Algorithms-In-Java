public class SumOfNNatural {
    public static int findNSum(int n)
    {
        if(n == 0){
            return 0;
        }
        return n+findNSum(n-1);
    }
    public static int findNaturalNumSum(int n, int sum)
    {
        if(n == 0){
            return sum;
        }

        sum+=n;
        return findNaturalNumSum(n-1, sum);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findNaturalNumSum(5, 0));
        System.out.println(findNSum(n));
    }
}
