public class HW3 {
    //Write a program to findLength of aStringusing Recursion.
    // public static void findStringLength(String str, int idx, int length){
    //     if(idx == str.length()){
    //         System.out.println(length);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     findStringLength(str, idx+1, length+1);
    // }
    public static int length(String str) {
        if(str.length() ==0) {
            return 0;
        }
        return length (str.substring(1)) +1;
    }

    public static void main(String[] args) {
        String str = "Vineetha";
       System.out.println(length(str));

        
    }
}
