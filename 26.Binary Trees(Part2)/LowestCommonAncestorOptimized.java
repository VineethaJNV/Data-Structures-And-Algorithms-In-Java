public class LowestCommonAncestorOptimized {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node findLCA(Node root, int n1, int n2){
        if( root == null){ // Base Case
            return null;
        }if(root.data == n1 || root.data == n2){ //If n1 & n2 are equal to root
            return root;
        }
        Node leftResult = findLCA(root.left, n1, n2); //
        Node rightResult = findLCA(root.right, n1, n2);

        if(leftResult == null){ //Both n1 and n2 are in right Subtree
            return rightResult;
        }
        if(rightResult ==null){ //Both n1 and n2 are in left Subtree
            return leftResult;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(findLCA(root, 4, 7).data);
    }
}
