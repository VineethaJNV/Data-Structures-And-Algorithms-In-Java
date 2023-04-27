public class MirrorABST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node mirrorABST(Node root){
        if(root == null){
            return null;
        }
        Node leftST = mirrorABST(root.left);
        Node rightST = mirrorABST(root.right);
        root.left = rightST;
        root.right = leftST;
        return root;
    }
    public static Node buildTree(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value > root.data){
            root.right = buildTree(root.right, value);
        }else if(value < root.data){
            root.left = buildTree(root.left, value);
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
        int values[] = {8, 5, 3, 6, 10, 11};
        Node root = null;
        for(int i = 0 ; i< values.length; i++){
            root = buildTree(root, values[i]);
        }
        inOrder(root);
        mirrorABST(root);
        System.out.println("\nMirrored BST");
        inOrder(root);
    }
}
