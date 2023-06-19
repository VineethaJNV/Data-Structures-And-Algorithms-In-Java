import java.util.PriorityQueue;
public class NearByCars {
    /*We are given N points in a 2D plane which are locations of N cars. If we are at the origin,
     * print the nearest K cars
     */
    static class Point implements Comparable<Point>{
        int idx;
        int x;
        int y;
        int dist;

        Point(int idx, int x, int y, int dist){
            this.idx = idx;
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        @Override
        public int compareTo(Point p2){
            return this.dist - p2.dist;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{3, 3}, {5, -1},{-2, 4}};
        int k = 2;
        PriorityQueue<Point>pq = new PriorityQueue<>();
        for(int i = 0 ; i < arr.length; i++){
            int idx = i;
            int x = arr[i][0];
            int y = arr[i][1];
            int distSq = x * x + y * y;
            pq.add(new Point(i, x, y, distSq));
        }
        System.out.println("There nearest K cars to the origin are: ");
        for(int i = 0 ; i < k; i++){
            System.out.println("C"+pq.remove().idx);
        }

    }
}
