public class SubStrStartAndEndWithSameChar {
    static int count = 0;
    public static void findStrCount(String s, int idx){
        if(idx == s.length()){
            return;
        }
        for(int i = idx; i < s.length(); i++){
            String subStr = s.substring(idx, i+1);
            if(subStr.length() == 1 || subStr.charAt(0) == subStr.charAt(subStr.length()-1)){
                System.out.print(subStr+" ");
                count++;
            } 
        }
        findStrCount(s, idx+1);
    }
    public static void main(String[] args) {
        String s = "aba";
        findStrCount(s, 0);
        System.out.println("count : "+count);
    }
}
