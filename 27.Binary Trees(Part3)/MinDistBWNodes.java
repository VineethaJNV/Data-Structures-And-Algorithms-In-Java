public class MinDistBWNodes {
    //Find LCA
    //Find dist from LCA to n1
    //Find dist from LCA to n2
    //Add the both distances
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
    public static Node findLCA(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2 ){
            return root;
        }
        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if(leftLCA == null){
            return rightLCA;
        }
        if(rightLCA == null){
            return leftLCA;
        }
        return root;
    }
    public static int findDistFromLCAToN(Node root, Node LCA, int n){
        if(root == null){
            return -1;
        }
        if( root.data == n){
            return 0;
        }
        int leftResult = findDistFromLCAToN(root.left, LCA, n);
        int rightResult = findDistFromLCAToN(root.right, LCA, n);

        if(leftResult == -1 && rightResult == -1){
            return -1;
        }
        if(leftResult == -1){
            return rightResult + 1;
        }
        if(rightResult == -1){
            return leftResult + 1;
        }
        return -1;

    }
    public static int findMinDistBW2Nodes(Node root, int n1, int n2){
        Node LCA = findLCA(root, n1, n2);
        int distFromLCAToN1 = findDistFromLCAToN(root, LCA, n1);
        int distFromLCAToN2 = findDistFromLCAToN(root, LCA, n2);

        return distFromLCAToN1 + distFromLCAToN2;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(findMinDistBW2Nodes(root, 5, 7));
        
    }
}
