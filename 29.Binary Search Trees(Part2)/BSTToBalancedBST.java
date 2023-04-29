import java.util.ArrayList;

public class BSTToBalancedBST {
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
    public static Node buildBalancedBST(ArrayList<Integer>list, int si, int ei){
        if(si > ei){ //invalid and base case => don't put "=" because of leaf node
            return null;
        }
        int mid = (si+ei) / 2;
        Node root = new Node(list.get(mid));
        root.left = buildBalancedBST(list, si, mid- 1); // =>left bst
        root.right = buildBalancedBST(list, mid+1, ei); //=> right bst

        return root;//=> root of balanced bst
    }
    public static void inOrder(Node root, ArrayList<Integer>list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int findHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftHt = findHeight(root.left);
        int rightHt = findHeight(root.right);

        return (Math.max(leftHt, rightHt)+ 1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        /*             8
         *            / \
         *           6   10    Unbalanced BST with a height of 4
         *          /     \
         *         5       11
         *        /         \
         *       3          12
         */
         /*  
                  Expected Binary Search Tree      
                           8
                         /  \
                        5    11
                       / \   / \
                      3   6  10 12
        */
        //Step - 01 => Get the inorder sequence of unbalanced bst
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);//List has the sorted sequence

        Node newRoot = buildBalancedBST(list, 0, list.size()-1);
        System.out.println("\nheight of unbalanced BST is: "+findHeight(root));
        System.out.println("pre order sequence of unbalanced bst");
        preOrder(root);
        System.out.println("\nheight of balanced BST is: "+findHeight(newRoot));
        System.out.println("pre order sequence of balanced bst");
        preOrder(newRoot);

    }
}
