public class TransformToSumTree {
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
    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = sumTree(root.left);
        int rightChild = sumTree(root.right);
        int data = root.data;
        int leftSum = 0;
        if(root.left != null){
            leftSum = root.left.data;
        }
        int rightSum = 0;
        if(root.right != null){
            rightSum = root.right.data;
        }
        root.data =  leftChild + leftSum+ rightChild + rightSum;
        return data;
    }
    public static void preOrder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
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
        System.out.println(sumTree(root));
        preOrder(root);
    }
}
