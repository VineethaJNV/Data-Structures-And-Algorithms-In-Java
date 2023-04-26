import java.util.ArrayList;
public class UnivaluedHW1 {
    /*Check if a Binary Tree is univalued or not
    We have a binary tree,the task is to check if the binary tree is uni valued or not.If found to be true, then print “YES”. Otherwise, print “NO”. */
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }
    public  static void preOrder(Node root, ArrayList<Integer>list){
        if(root == null){
            return;
        }
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
    public static boolean isUnivalTree(Node root) {
        ArrayList<Integer>list = new ArrayList<>();
        preOrder(root, list);
        for(int i = 0 ; i < list.size() -1; i++){
            if(list.get(i) != list.get(i+1)){
                return false;
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right =new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        System.out.println(isUnivalTree(root));

    }
}
