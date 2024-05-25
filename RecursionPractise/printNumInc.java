public class printNumInc{
    public static void printNumInc(int i, int n)
    {
        if(i == n+1)
        {
            return;
        }
        System.out.println(i);
        printNumInc(i+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumInc(1, n);
    }
}