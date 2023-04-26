public class RestoreArray {

    public static int numberOfArrays(String s, int k){
        if(s.length() == 0){
            return 1;
        }
        int count = 0;
        for(int i =  0; i < s.length(); i++){
            String subStr = s.substring(0, i+1);
            int temp = Integer.parseInt(subStr);

            if(temp <= k && (s.charAt(i+1) != '0' ||  i == s.length()-1)){
                String subStr2 = s.substring(i+1);
                count += numberOfArrays(subStr2, k);
            }
            

        }
        return count;

    }
    public static void main(String[] args) {
        String str = "1317";
        int k = 2000;
        System.out.println(numberOfArrays(str, k));
    }
}
