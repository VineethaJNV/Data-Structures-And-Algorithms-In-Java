public class UniquePrefix {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i = 0 ; i < children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int level = 0; level < word.length(); level++){
            char ch = word.charAt(level);
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static void findPrefix(Node root, String result){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(result);
            return;
        }
        for(int i = 0 ; i < root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], result+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "duck", "dove"};
        for(int i = 0 ; i< words.length; i++){
            insert(words[i]);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}
