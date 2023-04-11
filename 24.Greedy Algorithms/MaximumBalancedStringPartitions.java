public class MaximumBalancedStringPartitions {
    /*We have balanced String str of size N with an equal number of L and R, the task 
    is to find a amaximum number X, such that a given string can be partitioned 
    into X balanced substring. Astring is balanced if the Number of L's in the string
     equals the number of R's */
     public static int balancedStringSplit(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++){
            String subStr = s.substring(0,i);
            int LCount = 0;
            int RCount = 0;
            for(int j = 0; j <subStr.length(); j++){
                if(subStr.charAt(j) == 'L'){
                    LCount++;
                }else{
                    RCount++;
                }
            }
            if( LCount == RCount){
                result++;
            }
        }
        return result;
        
    } 
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        System.out.println("Maximum number of balanced strings that can be formed are: "+balancedStringSplit(str));
        
    }
}
