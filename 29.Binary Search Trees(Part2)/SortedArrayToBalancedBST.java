public class SortedArrayToBalancedBST{
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
    public static Node balancedBST(int arr[], int si, int ei){
        if(si > ei){ //base case -> same as merge sort
            return null;
        }

        int mid = (si + ei)/2;
        Node root = new Node(arr[mid]);
        root.left = balancedBST(arr, si, mid-1);
        root.right = balancedBST(arr, mid+1, ei);
      
        return root;
    }
    public static int calcHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftHt = calcHeight(root.left);
        int rightHt = calcHeight(root.right);

        return (Math.max(leftHt, rightHt)) + 1;
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
        int arr[] = {3, 5, 6, 8, 10, 11, 12}; //Sorted array
        /*  
                  Expected Binary Search Tree      
                           8
                         /  \
                        5    11
                       / \   / \
                      3   6  10 12
        */
        Node root = balancedBST(arr, 0, arr.length-1);
        inOrder(root);
        System.out.println("\nMinimum height possible for the BST is: "+calcHeight(root));
    }
}