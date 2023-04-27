public class SearchABST {
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
    public static boolean searchKey(Node root, int key){ // O(H)
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key > root.data){
            return searchKey(root.right, key);
        }else{
            return searchKey(root.left, key);
        }
    }
    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }else if(value > root.data){
            root.right = insert(root.right, value);
        }else{
            root.left = insert(root.left, value);
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
        int values[] = {8, 5, 6, 3, 4, 1, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        int key = 7;
        System.out.println("is the key found?: "+searchKey(root, key));
    }
}
