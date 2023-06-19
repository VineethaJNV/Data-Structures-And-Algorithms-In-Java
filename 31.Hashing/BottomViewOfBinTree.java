import java.util.*;
public class BottomViewOfBinTree {
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
        int hd;
        Node node;
        Info(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    public static void getBottomView(Node root){
        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        int min = 0;
        int max = 0;
        q.add(new Info(0, root));
        q.add(null);

        while(! q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(curr);
                }
            }else{
                map.put(curr.hd, curr.node);
                // if(!map.containsKey(curr.hd)){
                    
                //     map.put(curr.hd, curr.node);
                // }

                if(curr.node.left != null ){
                    q.add(new Info(curr.hd-1, curr.node.left));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.hd+1, curr.node.right));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        System.out.println(map);
        System.out.println("min "+min+","+" max "+max);
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data+" ");
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
       preOrder(root.left);
       preOrder(root.right);
    }
    public static void main(String[] args) {
        /*                   20
         *                   /\
         *                  8  22
         *                 /\    \
         *                5  3   25
         *                  / \ 
         *                 10 14
         * ans = 5, 3, 10, 14, 25
         */
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.right.right = new Node(25);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        // preOrder(root);
        getBottomView(root);

        
    }
}
