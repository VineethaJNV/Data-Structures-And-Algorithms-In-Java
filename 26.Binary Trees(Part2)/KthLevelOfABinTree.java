import java.util.*;
public class KthLevelOfABinTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public static void printKthLevel(Node root, int k){
        if(root == null || k == 0){
            return;
        }if(k == 1){
            System.out.print(root.data+" ");
            return;
        }else{
            Queue<Node>q = new LinkedList<>();
            int count = 0;
            q.add(root);
            q.add(null);
            count++;
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    count++;
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if( count == k){
                        System.out.print(curr.data+" ");
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(15);
        printKthLevel(root, 4);


    }
}
