public class FindFact {
    public static int calcFact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        int factNm = calcFact(n-1);
        return n*factNm;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcFact(n));;
    }
}
