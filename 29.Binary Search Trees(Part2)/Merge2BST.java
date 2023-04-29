import java.util.ArrayList;

public class Merge2BST {
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
    public static void inOrder(Node root, ArrayList<Integer>list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

    }
    public static Node balancedBSTfromSortedSeq(ArrayList<Integer>list, int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = balancedBSTfromSortedSeq(list, si, mid-1);
        root.right = balancedBSTfromSortedSeq(list, mid+1, ei);
        return root;
    }
    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        inOrder(root1, list1);
        inOrder(root2, list2);
        ArrayList<Integer> mList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
               mList.add(list1.get(i));
               i++;
            }else{
                mList.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()){
            mList.add(list1.get(i));
               i++;
        }
        while(j < list2.size()){
            mList.add(list2.get(j));
                j++;   
        }
        Node newRoot = balancedBSTfromSortedSeq(mList, 0, mList.size()-1);
        return newRoot;
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
        return (Math.max(leftHt, rightHt))+1;
    }
    public static void main(String[] args) {
        //First BST                 //Second BST
             /*   2                       9
              *  / \                     / \
                1   4                   3   12
              */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        
        Node mergedTreeNode = mergeBST(root1, root2);
        System.out.println("Pre order sequence of merged tree is");
        preOrder(mergedTreeNode);
        System.out.println("\nHeight of merged balanced tree is: "+findHeight(mergedTreeNode));
    }
}
