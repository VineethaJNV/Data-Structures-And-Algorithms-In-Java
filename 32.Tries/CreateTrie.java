import javax.swing.text.AsyncBoxView;

public class CreateTrie{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0 ; i < children.length; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){ //O(L)
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
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0 ; level < key.length(); level++){
            char ch = key.charAt(level);
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {
        String arr[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i = 0 ; i < arr.length; i++){
            insert(arr[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
    }
}