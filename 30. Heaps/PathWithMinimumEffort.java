import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    /*We have a two-dimensional grid, each cell of which contains an integer cost which represents
a cost to traverse through that cell, we need to find a path from the top left cell to the bottom
right cell by which the total cost incurred is minimum. */
    static class Cost {
        int value;
        int right;
        int left;
        int up; 
        int down;
        Cost(int val, int right, int left, int up, int down){
            this.value = val;
            this.right = right;
            this.left = left;
            this.up = up;
            this.down = down;
        }
    }
public static void main(String[] args) {
    int arr[][] = { { 31, 100, 65, 12, 18 },
                    { 10, 13, 47, 157, 6 },
                    { 100, 113, 174, 11, 33 },
                    { 88, 124, 41, 20, 140 },
                    { 99, 32, 111, 41, 20 } };
    PriorityQueue<Cost>pq = new PriorityQueue<>();
    
    
}
}
