public class XpowerXHW1 {
    //What is the value of x^x for any valueof x?
    public static int xPowX(int n){
        int ans = 1;
        int a = n;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }

            a = a*a;
            n = n >>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(xPowX(3));
    }
}
