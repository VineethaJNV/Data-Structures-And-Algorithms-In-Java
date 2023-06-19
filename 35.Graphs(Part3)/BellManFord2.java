import java.util.ArrayList;

public class BellManFord2 {
    public class BellmanFordAlgo {
        /*Shortest path from source to all vertices =>Negative edges */
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
        public static void bellManFord(ArrayList<Edge>graph, int src, int V){
            int dist[] = new int[V];
    
            for(int i = 0 ; i < dist.length; i++){
                if(i != src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }
        
            for(int i = 0; i < V; i++){
    
                for(int j = 0;j  < graph.size(); j++){
                    Edge e = graph.get(j);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                    
                }
            }
            for(int i = 0 ; i < dist.length; i++){
                System.out.print(dist[i]+" ");
            }
        }
        public static void createGraph(ArrayList<Edge>graph){
            graph.add(new Edge(0, 1, 2));
            graph.add(new Edge(0, 2, 4));
    
            graph.add(new Edge(1, 2, -4));
    
            graph.add(new Edge(2, 3, 2));
    
            graph.add(new Edge(3, 4, 4));
            
            graph.add(new Edge(4, 1, -1));
        }
        public static void main(String[] args) {
            int V = 5;
            ArrayList<Edge>graph = new ArrayList<>();
            createGraph(graph);
            bellManFord(graph, 0, V);
        }
    }
    
}
