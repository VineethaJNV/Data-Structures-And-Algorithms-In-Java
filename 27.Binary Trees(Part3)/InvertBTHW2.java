public class InvertBTHW2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static boolean isInvert(Node root1, Node root2){ 
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null && root2 != null){
            return false;
        }
        else if(root2 == null && root1 != null){
            return false;
        }
        if(root1 != null && root2 != null){
            if(root1.data != root2.data){
                return false;
            }
        }
        boolean result1 = isInvert(root1.left, root2.right);
        boolean result2 = isInvert(root1.right, root2.left);
    
        return result1 && result2;
        
        
        
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.left.left = new Node(7);
        root1.left.right =new Node(6);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);
        System.out.println(isInvert(root, root1));
        preOrder(root);
        System.out.println();
        preOrder(root1);
        
    }
}
