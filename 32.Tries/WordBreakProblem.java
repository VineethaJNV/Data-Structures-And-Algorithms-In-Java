public class WordBreakProblem {
    /* Given an input string and a dictionary of words, find out if the input string can be broken into a space separated sequence of dictionary words */
    static class Node{
        Node children[] = new Node[26]; // 'a' - 'z'
        boolean eow = false;

        public Node(){
            for(int i = 0 ; i< children.length; i++){
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
    public static boolean search(String key){
        Node curr = root;

        for(int level = 0; level < key.length(); level++){
            char ch = key.charAt(level);
            int idx = ch - 'a';
           if(curr.children[idx] == null){
                return false;
           }
           curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key){
        // System.out.print("key in this call:  "+key+" ");
        if(key.length() == 0){
            return true;
        }
        for(int i = 1 ; i <= key.length(); i++){
            String firstHalf = key.substring(0, i);
            System.out.print("firstHalf:  "+firstHalf+" ");
            String secondHalf = key.substring(i);
            System.out.print("secondhalf:  "+secondHalf +" ");
            if(search(firstHalf) && wordBreak(secondHalf)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] ={"i", "like", "sam", "samsung", "mobile","ice"};
        String key = "ilikesamsung";
        
        for(int i = 0 ; i < words.length; i++){ //creating a trie
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
        
    }
}
