import java.util.*;
public class LowestCommonAncestor {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data =data;
            this.right = null;
            this.left = null;
        }

    }
    public static boolean getPath(Node root, int n, ArrayList<Node>list){
        if(root == null){
            return false;
        }
        list.add(root);
        if(root.data == n){
            return true;
        }
        boolean leftFound = getPath(root.left, n, list);
        boolean rightFound = getPath(root.right, n, list);

        if(leftFound || rightFound){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    public static Node findLowestCommonAncestor(Node root, int n1, int n2){ //O(n)
        if(root == null){
            return null;
        }
        ArrayList<Node>path1 = new ArrayList<>();
        ArrayList<Node>path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        for( ; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        
        Node lca = path1.get(i-1);
        return lca;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Lowest Common Ancestr is: "+findLowestCommonAncestor(root, 4, 3).data);
    }
}
