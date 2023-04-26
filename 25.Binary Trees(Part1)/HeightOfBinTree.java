public class HeightOfBinTree {
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
    public static int calcBinTreeHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftSubHt = calcBinTreeHeight(root.left);
        int rightSubHt = calcBinTreeHeight(root.right);
        int currHt = Math.max(leftSubHt, rightSubHt) + 1;
        return currHt;
    }
    public static int calcNoOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSubNodes = calcBinTreeHeight(root.left);
        int rightSubNodes = calcBinTreeHeight(root.right);
        return (leftSubNodes+rightSubNodes+1);
    }
    public static void main(String[] args) {
        /*      1
         *     / \
         *    2   3
         *   / \  / \
         *  4   5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println("Height of Binary tree is: "+calcBinTreeHeight(root));
        System.out.println("Total number of Binary tree nodes are: "+calcNoOfNodes(root));

    }
}
