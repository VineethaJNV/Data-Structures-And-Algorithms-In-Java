public class ValidBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    public static boolean isValidBST(Node root, Node max, Node min){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, root, min) && isValidBST(root.right, max, root);
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
        // int values[] = {3,2,1,4,5};
        int values[] = {1,1,1,3};
        Node root = null;
        for(int i = 0 ; i < values.length; i++){
            root = buildBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        root.data = 3;
        // root.left.right = new Node(4);
        inOrder(root);
        System.out.println("Is valid BST? "+isValidBST(root, null, null));
    }
}
