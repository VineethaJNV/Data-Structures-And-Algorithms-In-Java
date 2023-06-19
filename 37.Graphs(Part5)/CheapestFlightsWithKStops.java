import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithKStops{
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Info{
        int src;
        int cost;
        int stops;

        public Info(int src, int cost, int stops){
            this.src = src;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static int cheapestFlight(int flights[][], int src, int dest, int k){
        ArrayList<Edge>[]graph = new ArrayList[flights.length];
        createGraph(graph, flights);
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        int dist[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        while(! q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k ){
                break;
            }
            for(int i = 0 ; i < graph[curr.src].size(); i++){
                Edge e = graph[curr.src].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                // if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stops <= k){
                //     dist[v] = dist[u] + wt;
                //     q.add(new Info(e.dest, dist[e.dest], curr.stops+1));
                // }
                if( curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(e.dest, dist[e.dest], curr.stops+1));
                }                   
            }   
        }
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    // public static void dfs(ArrayList<Edge>[]graph, int curr, boolean vis[]){
    //     vis[curr] = true;
    //     System.out.println(curr);

    //     for(int i = 0; i < graph[curr].size(); i++){
    //         Edge e = graph[curr].get(i);
    //         if(! vis[e.dest]){ 
    //             dfs(graph, e.dest, vis);
    //         }
    //     }
    // }
    public static void createGraph(ArrayList<Edge>[]graph, int[][] flights){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < graph.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
            // graph[flights[i][0]].add(new Edge(flights[i][0], flights[i][1], flights[i][2]));
        }
    }
    public static void main(String[] args) {
        int[][] flights = {{0, 1, 100},{1, 2, 100},{2, 0, 100}, {1, 3, 600},{2, 3, 200}};
        int src = 0;
        int dest = 3;
        int k = 1;
        
        // dfs(graph, 0, new boolean[graph.length]);
        System.out.println(cheapestFlight(flights, src, dest, k));
    }
}