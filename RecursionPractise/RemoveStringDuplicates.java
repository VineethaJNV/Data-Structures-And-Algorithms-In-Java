public class RemoveStringDuplicates {
    public static void removeDuplicates(String s, int idx, StringBuilder sb, boolean []map){
        if(idx == s.length()){
            return ;
        }
        if(map[s.charAt(idx)-'a']){ //if the cahr is duplicate
            removeDuplicates(s, idx+1, sb, map);
        }else{
            map[s.charAt(idx)-'a'] = true;
        removeDuplicates(s, idx+1, sb.append(s.charAt(idx)), map);
        }
        
    }
    public static void main(String[] args) {
        String input = "appnnacollege";
        boolean[] map = new boolean[26];
        StringBuilder sb = new StringBuilder();
        removeDuplicates(input, 0, sb, map);
        System.out.println(sb);
    }
}
