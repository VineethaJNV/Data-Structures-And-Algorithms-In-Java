public class StringPerm {
    public static void printPermutations(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermutations(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
