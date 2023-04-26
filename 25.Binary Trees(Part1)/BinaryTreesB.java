import java.lang.module.FindException;
import java.util.*;
public class BinaryTreesB {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BinartTree{
        static int idx = -1;
        public static Node createBinTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = createBinTree(nodes);
            newNode.right = createBinTree(nodes);

            return newNode;

        }
        public static void preOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            postOrder(root.left); 
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node temp = q.remove();
                if(temp == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(temp);
                    }
                    
                }else{
                    System.out.print(temp.data +" ");
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
            }
        }
        public static int findHeight(Node root){
            if(root == null){
                return 0;
            }
            int lh = findHeight(root.left);
            int rh = findHeight(root.right);
            return Math.max(lh, rh) + 1;
        }
        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount+rightCount+1;
        }
        public static int findSum(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = findHeight(root.left);
            int rightSum = findSum(root.right);
            int currSum = leftSum+rightSum+root.data;
            return currSum;
        }
        
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinartTree tree = new BinartTree();
        Node root = tree.createBinTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println("\nInorder traversal is as follows:");
        tree.inOrder(root);
        System.out.println("\nPostorder traversal is as follows:");
        tree.postOrder(root);
        System.out.println("\nLevelOrder traversal is as follows:");
        tree.levelOrder(root);

        System.out.println("Height of tree is");
        System.out.println(tree.findHeight(root));

        System.out.println("No of nodes in tree is");
        System.out.println(tree.countNodes(root));
        System.out.println("Sum of total nodes is: ");
        System.out.println(tree.findSum(root));

    }
}
