public class DeleteANodeInBST {
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
    public static Node findInOrderSucc(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node deleteNode(Node root, int val){
        if(val < root.data){
            root.left = deleteNode(root.left, val);
        }else if(val >  root.data){
            root.right = deleteNode(root.right, val);
        }else{
            if(root.left == null && root.right == null){//leaf node
                return null;
        }
        //case 2 => single child
        if(root.left == null){
            return root.right;
        }else if(root.right == null){
            return root.left;
        }
        //case 3 => both children exist
        // step1 =>Find inorder successor
        Node inOrderSucc = findInOrderSucc(root.right);//inorder successor is the leftmost node in right suntree, so calling for root.right
        root.data = inOrderSucc.data; //replacing the node
        root.right = deleteNode(root.right, inOrderSucc.data);// deleting the inorder successor
        }
      
        
    return root;
    }
    public static Node searchInBST(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data == key){
            return root;
        }
        if(key > root.data){
            return searchInBST(root.right, key);
        }else{
            return searchInBST(root.left, key);
        }
    }
    public static Node buildBST(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value > root.data){
            root.right = buildBST(root.right, value);
        }else{
            root.left = buildBST(root.left, value);
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
        int values[] = {8, 5, 3, 6, 1, 4, 10, 11, 14};
        Node root = null;
        for(int i = 0 ; i < values.length; i++){
            root = buildBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println("Is the key found? "+searchInBST(root, 10).data);

        root = deleteNode(root, 8);
        inOrder(root);
    }
}
