public class NumToEngString {
    public static StringBuilder printString(int num, String[] map, StringBuilder ans){
        if(num <= 0){
            return new StringBuilder("");
        }
       
        // int lastDigit = num%10;
        // num = num / 10;
        printString(num/10, map, ans);
        ans.append(map[num%10]);
        ans.append(" ");
        return ans;
        // ans = ans+map[lastDigit];
        
    }
    public static void main(String[] args) {
        int n = 1947;
        String[] map = {"zero", "one", "two", "three", "four", "five","six", "seven","eight", "nine"};
        StringBuilder sb = new StringBuilder("");
        sb = printString(n, map, sb);
        System.out.println(sb);


    }
}
