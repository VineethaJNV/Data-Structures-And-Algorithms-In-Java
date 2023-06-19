public class LCSubStringRec {
    public static int findLCSubString(String s1,int n, String s2, int m, int ans){
        if(n <= 0 || m <= 0){
            return 0;
        }
        if(s1.charAt(n) == s2.charAt(m)){
            int temp = findLCSubString(s1, n-1, s2, m-1, ans)+1;
            ans = Math.max(temp, ans);
            return ans;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        // String str1 = "ABCDE";
        // String str2 = "ABGCE";
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        // int count = 0;
       ;
       System.out.println(findLCSubString(str1, str1.length()-1, str2, str2.length()-1, 0));
        
    }
}
