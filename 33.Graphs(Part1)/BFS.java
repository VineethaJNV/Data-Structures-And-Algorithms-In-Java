import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void bfsTraversal(ArrayList<Edge>[]graph){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

        //Add source into the queue
        q.add(0);
        while(! q.isEmpty()){
            int curr = q.remove();
            if(! visited[curr]){
                //Visit the vertex
                visited[curr] = true;
                //print it
                System.out.print(curr+" ");
                //Add it's neighbours into the queue
                for(int i = 0 ; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){

        for(int i = 0 ; i < graph.length; i++ ){
            graph[i] = new ArrayList<>();
        }
        //Store 0's edges
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //Store 1's edges
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        //Store 2's edges
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //Store 3's edges
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        //Store 4's edges
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        //Store 5's edges
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //Store 6's edges
        graph[6].add(new Edge(6, 5, 1));

    }
    public static void main(String[] args) {
        /* 
         *        1----------3\
         *       /           | \
         *      0            |  5
         *       \           | / \
         *        2----------4/   \
         *                         6
         */ 
        
         int V = 7;
         ArrayList<Edge>[] graph = new ArrayList[V];
         createGraph(graph);

         bfsTraversal(graph);

         //printitng 3's neighbours
        //  for(int i = 0 ; i < graph[3].size(); i++){
        //     Edge e = graph[3].get(i);
        //     System.out.print(e.dest+" ");
        //  }
    }
}
