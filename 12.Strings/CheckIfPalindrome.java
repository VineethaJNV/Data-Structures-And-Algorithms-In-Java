public class CheckIfPalindrome { //O(N)
    //divide the string into 2 halves
    //compare the 1st letter with last letter
    //compare the 2nd letter with 2nd last letter
    //comapre the 3 rd letter with 3rd last letter
    public static boolean isPalindrome(String str){ //finding reverse and comparing
        String rev ="";
        for(int i = str.length()- 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static boolean checkIfPalindrome(String str){//using 2 pointer approach to compare
        int i = 0;int j = str.length() - 1;
        while(i < str.length()/2){
            if(!(str.charAt(i) == str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isStringPal(String str){//looping length()/2 times and comparing
        for(int i = 0; i < str.length()/2; i++){
            if(!(str.charAt(i) == str.charAt(str.length()-1-i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        String s1 = "racecar";
        String s2 = "noon";
        String s3 = "madam";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s1));


        System.out.println(checkIfPalindrome(s1));
        System.out.println(checkIfPalindrome(s2));
        System.out.println(checkIfPalindrome("vineetha"));


        System.out.println(isStringPal(s1));
        System.out.println(isStringPal(s1));
        System.out.println(isStringPal("vineetha"));


    }
    
}
