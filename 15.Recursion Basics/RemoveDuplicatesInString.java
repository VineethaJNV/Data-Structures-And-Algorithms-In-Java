public class RemoveDuplicatesInString {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        String str = "viinnneeeettthhaa";
        StringBuilder sb = new StringBuilder();
        removeDuplicates(str, 0, sb, map);
        
    }
}
