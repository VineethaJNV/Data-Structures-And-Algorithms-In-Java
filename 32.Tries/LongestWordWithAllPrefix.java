public class LongestWordWithAllPrefix {
    static class Node{
        Node children[] = new Node[26];
        boolean eow;

        public Node(){
            for(int i = 0 ; i < children.length;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static String finalAns = "";
    public static void findLongest(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 0 ; i < root.children.length; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp .length() > finalAns.length()){
                    finalAns = temp.toString();
                }
                findLongest(root.children[i], temp);
                //backtrack
                temp.deleteCharAt(temp.length()-1);
            }  
        }
    }

    // public static String findLongestWord(Node root){
    //     Node curr = root;
    //     String ans = "";
    //     if(root == null){
    //         return "";
    //     }
    //     for(int i = 0 ; i < curr.children.length; i++){
    //         if(curr.children[i] != null){
    //             if(curr.children[i].eow)
    //                 ans += (char) (i+'a');
    //         }
    //         curr = curr.children[i];
    //     }
    //     return ans;
    // }
    public static void  insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            char ch =word.charAt(level);
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i = 0 ; i < words.length; i++){
            insert(words[i]);
        }
        findLongest(root,new StringBuilder(""));
        System.out.println(finalAns);
    }
}
