public class DiameterOfTree{
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right= null;
        }
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static int calcHeight(Node root){
        if(root  == null){
            return 0;
        }
        int lh = calcHeight(root.left);
        int rh = calcHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int calcDiameter(Node root){ //O(n^2)
        if(root == null){
            return 0;
        }
        int leftDiam = calcDiameter(root.left);
        int rightDiam = calcDiameter(root.right);
        int leftHt = calcHeight(root.left);
        int rightHt = calcHeight(root.right);
        int selfDiam = leftHt+rightHt+1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
    public static Info optimizedDiameter(Node root){
        if(root == null){
            return new Info(0,0) ;
        }
        Info leftInfo = optimizedDiameter(root.left);
        Info rightInfo = optimizedDiameter(root.right);

        int diam = Math.max(leftInfo.ht+rightInfo.ht+1, Math.max(leftInfo.diam, rightInfo.diam));
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, height);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Diameter of the given tree is: "+calcDiameter(root));

        System.out.println("Diameter of the given tree with optimized approach is: "+optimizedDiameter(root).diam);
    }
}