public class OptimizedXpowN {
    public static int optimizedXPowN(int x, int n){ // Olog(n)
        if(n == 0){
            return 1;
        }
        // int halfSquare = optimizedXPowN(x, n/2) * optimizedXPowN(x, n/2);
        int halfPow = optimizedXPowN(x, n/2);
        int halfSquare = halfPow * halfPow;

        if(n% 2 != 0){
            halfSquare = x * halfSquare;
        }
        return halfSquare;
    }
    public static void main(String[] args) {
        System.out.println(optimizedXPowN(2, 10));
    }
}
