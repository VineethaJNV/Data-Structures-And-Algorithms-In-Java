public class FloodFillAlgo {
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int origCol){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length ){
            return;
        }if(image[sr][sc] != origCol){
            return;
        }if(vis[sr][sc]){
            return;
        }

        image[sr][sc] = color;

        //left
        helper(image, sr, sc-1, color, vis, origCol);
        
        //right
        helper(image, sr, sc+1, color, vis, origCol);
        
        //up
        helper(image, sr-1, sc, color, vis, origCol);
        
        //down
        helper(image, sr+1, sc, color, vis, origCol);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        boolean vis[][] =new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
}
