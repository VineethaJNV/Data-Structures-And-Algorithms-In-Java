import java.util.ArrayList;
public class PathsFromRootToLeaf{
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
    public static void totalPathsFromRootToLeaf(Node root, ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
            
        }
        totalPathsFromRootToLeaf(root.left, path);
        totalPathsFromRootToLeaf(root.right, path);
        path.remove(path.size()-1); 
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
        int values[] = {8, 5, 10, 3,6, 11, 14};
        Node root = null;
        for(int i = 0 ; i < values.length; i++){
            root = buildBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        ArrayList<Integer>list = new ArrayList<>();
        totalPathsFromRootToLeaf(root, list);

    }
}