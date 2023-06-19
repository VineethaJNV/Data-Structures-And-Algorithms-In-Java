import java.util.*;
public class CountUniqueSubStrings {
    static class Node{
        Node children[] = new Node[26];
        boolean eow;

        public Node(){
            for(int i = 0 ; i< children.length; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String sufix){
        Node curr = root;

        for(int i = 0; i < sufix.length();i++){
            char ch = sufix.charAt(i);
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr  =curr.children[idx];
        }
        curr.eow = true;
    }
    public static int countTrieNodes(Node root){
        if(root == null){
            return 0;
        }
        Node curr = root;
        int count = 0 ;
        for(int i = 0; i < curr.children.length; i++){
            if(curr.children[i] != null){
                count += countTrieNodes(root.children[i]);
            }
        }
        return count + 1;
    }
    // static HashSet<String>set = new HashSet<>();
    // public static void printAllSubStrings(String str){
    //     for(int i = 0 ; i < str.length(); i++){
    //         String ans = "";
    //         for(int j = i; j < str.length(); j++){
    //             ans += str.charAt(j);
    //             System.out.println(ans+ " ");
    //             set.add(ans);
    //         }
            
    //     }
    // }
    
    public static void findAllSufix(String str, String suffix[]){
        for(int i = 0; i < str.length(); i++){
            String ans = "";
            for(int j = i; j < str.length(); j++){
                
                ans += str.charAt(j);
            }
           suffix[i] = ans;
        }
    }
    public static void printArr(String arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "ababa";
        String suffix[] = new String[str.length()];
        findAllSufix(str, suffix);
        printArr(suffix);

        for(int i = 0 ;  i< suffix.length; i++){
            insert(suffix[i]);
        }
        System.out.println(countTrieNodes(root));
        // printAllSubStrings(str);
        // System.out.println(set);
        // int ans = set.size();
        // ans++;
        // System.out.println("unique substrings are: "+ans);
        
    }
}
