public class StartsWithProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow;

        public Node(){
            for(int i = 0; i < children.length; i++){
                children[i] = null;
            }
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
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean startsWith(String key){
        Node curr = root;

        for(int i = 0 ; i < key.length(); i++){
            printArr(curr.children);
            char ch = key.charAt(i);
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void printArr(Node arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i].children+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String key = "wom";
        for(int i = 0 ; i< words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(key));

    }
}
