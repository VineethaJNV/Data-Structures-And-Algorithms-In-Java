class MaxPathSumBWSpecialNodes {
    int calcPathSum(Node root, int sum){
        if(root == null){
            return 0;
        }if(root.right == null && root.left == null){
            return root.data;
        }
        int leftSum = calPathSum(root.left, sum);
        int rightSum = calPathSum(root.right, sum);
        
        if(root.left != null && root.right != null){
            sum = Math.max(sum, root.data+leftSum, rightSum);
            return root.data+Math.max(leftSum, rightSum);
        }
        if(root.left != null){
            return root.data+leftSum;
        }
        if(root.right != null){
            return root.data+rightSum;
        }
    }
    int maxPathSum(Node root){
        int sum = Integer.MAX_VALUE;
        int result = calcPathSum(root, sum);
        if(root.left != null && root.right != null){
            return result;
        }
        return Math.max(sum, result);
        
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }
}