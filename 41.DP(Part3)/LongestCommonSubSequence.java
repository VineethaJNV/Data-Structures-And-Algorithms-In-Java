public class LongestCommonSubSequence {
    public static int findLCS(String str1, int n, String str2, int m, String lcs){
        if(n < 0 || m < 0){
            return 0;
        }
        //case 1 => last characters are equal
        if(str1.charAt(n) == str2.charAt(m)){
            lcs += str1.charAt(n);
            System.out.println(lcs);
            return findLCS(str1, n-1, str2, m-1, lcs)+1;
        }else{
            int ans1 = findLCS(str1, n-1, str2, m, lcs);
            int ans2 = findLCS(str1, n, str2, m-1, lcs);
            return Math.max(ans1, ans2);
        }
        
    }
    public static void main(String[] args) {
        // String str1 = "abcde";
        // String str2 = "ace";
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(findLCS(str1, str1.length()-1, str2, str2.length()-1, ""));

    }
}
