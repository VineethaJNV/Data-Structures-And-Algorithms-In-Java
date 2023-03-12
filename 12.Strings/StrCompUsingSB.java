public class StrCompUsingSB {
    public static String compressString(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0 ; i < str.length(); i++){
            Integer count  = 0 ;
            char ch = str.charAt(i);
            count = 1;
            while(i < str.length()-1 && ch == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str));
    }
}
