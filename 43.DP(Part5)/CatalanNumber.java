public class CatalanNumber {
    public static int findNthCatalan(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += findNthCatalan(i) * findNthCatalan(n-i-1);
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findNthCatalan(n));
    }
}
