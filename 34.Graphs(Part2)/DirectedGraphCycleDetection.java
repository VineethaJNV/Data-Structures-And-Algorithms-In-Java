import java.util.ArrayList;

public class DirectedGraphCycleDetection {
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
    public static boolean isCycleInDirected(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i = 0;  i <graph.length; i++){
            if(! vis[i]){
                if(isCycleUtil(graph,i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0 ; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){ //cycle exists
                return true;
            }
            if((! stack[e.dest]) && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        //Graph 1 => cycle doesn't exist
        // graph[0].add(new Edge(0, 1, 0));
        // graph[0].add(new Edge(0, 2, 0));

        // graph[1].add(new Edge(1, 3,0));

        // graph[2].add(new Edge(2, 3, 0));

        //Graph 2 => Cycle exists
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 0, 0));
    }
    public static void main(String[] args) {
        /*
         *              0
         *             / \
         *            2   1
         *            \   /
         *              3
         * Directed graph1 =>False =>No cycle
         */

         /*       1-------------0
          *                     | \ 
                                |  \
                                |   3
                                |   /
                                |  /
                                2
          
          Directed graph 2 => True => Cycle exists                      */
        int V = 4;
        ArrayList<Edge>[]graph = new ArrayList[4];
        createGraph(graph);
        System.out.println(isCycleInDirected(graph));
    }
}
