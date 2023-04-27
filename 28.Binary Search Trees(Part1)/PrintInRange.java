import java.util.ArrayList;
public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
            this.left = null;
            this.right=  null;
        }
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        else if(k1 <= root.data && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
            // System.out.print(root.data+" ");
        }
        else if(k1 < root.data){
            printInRange(root.left, k1, k2);
        }else {
            printInRange(root.right, k1, k2);
        }
    }
    public static Node buildBST(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value > root.data){
            root.right = buildBST(root.right, value);
        }else{
            root.left = buildBST(root.left, value);
        }
        return root;

    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 1, 4, 10, 11, 14};
        Node root = null;
        for(int i = 0 ; i < values.length; i++){
            root = buildBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        printInRange(root, 5, 12);
        
    }
}
