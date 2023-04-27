public class BuildABST{
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
    
    public static Node buildBST(int value, Node root){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.data){
            root.left = buildBST(value, root.left);
        }else{
            root.right = buildBST(value, root.right);   
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
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int  i = 0; i < values.length; i++){
            root = buildBST(values[i], root);
        }
        inOrder(root);
        System.out.println();
        
        
    }
}