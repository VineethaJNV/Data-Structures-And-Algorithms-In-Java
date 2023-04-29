public class SizeOfLargestBSTinBT {
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
    static class Info{
        boolean isValid;
        int size;
        int min;
        int max;
        Info(boolean isvalid, int size, int min, int max){
            this.isValid = isvalid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxSize = Integer.MIN_VALUE;
    public static Info findSizeOfLargestBSTinBT(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = findSizeOfLargestBSTinBT(root.left);
        Info rightInfo = findSizeOfLargestBSTinBT(root.right);
        int size = (leftInfo.size+rightInfo.size+1);
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
       
       
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isValid && rightInfo.isValid){
            maxSize = Math.max(maxSize, size);
            // System.out.println(maxSize);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }
    public static void main(String[] args) {
        /*                  50
         *                 / \
         *                30  60
         *               / \  / \
         *              5  20 40  70
         *                        / \
         *                       65 80
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

                    /*   60
                     *  / \
                     * 40  70
                     *     / \
                     *    65 80
                     * Expected output is of size 5
                     */
        Info info = findSizeOfLargestBSTinBT(root);
       System.out.println("Max size of largest BST is: "+maxSize);


        
    }
}
