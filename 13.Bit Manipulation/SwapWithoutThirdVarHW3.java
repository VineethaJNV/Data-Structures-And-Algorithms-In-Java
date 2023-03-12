public class SwapWithoutThirdVarHW3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("before swapping:"+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping:"+a+" "+b);
    }
}
