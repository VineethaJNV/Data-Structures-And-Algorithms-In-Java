public class SamplePrefix {
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

    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        Node curr = root;
        for(int level = 0; level < root.children.length; level++){
           if(root.children[level] != null){
            findPrefix(root.children[level], ans+(char)(level + 'a'));
           }
        }
    }

    public static void insert(String word){
        Node curr = root;

        for(int level = 0; level < word.length(); level++){
            char ch = word.charAt(level);
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
                curr.children[idx].freq = 1;
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        root.freq = -1;
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
        findPrefix(root, "");
    }
}
