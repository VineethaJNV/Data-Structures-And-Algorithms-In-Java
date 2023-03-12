public class StringCompression {
    public static String compressString(String str){// O(N) Linear
        String compressedString = "";
        
        for(int i = 0 ; i < str.length(); i++){
            compressedString += str.charAt(i);
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            if(count > 1){
                compressedString += count.toString();
            }
            
        }
        return compressedString;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd"; //a3b2c3d2
        String str1 = "abcd"; //a3b2c3d2
        System.out.println(compressString(str));
        System.out.println(compressString(str1));
        
    }
}
