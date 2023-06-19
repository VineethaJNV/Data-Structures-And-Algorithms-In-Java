import java.util.ArrayList;

public class TarjansAlgo {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void tarjansBridge(ArrayList<Edge>[]graph){
        int dt[] = new int[graph.length];
        int low[] = new int[graph.length];
        int time = 0;
        boolean vis[] = new boolean[graph.length];

        for(int i = 0 ;  i< graph.length; i++){
            if(! vis[i]){
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }

    }
    public static void dfs(ArrayList<Edge>[]graph, int curr,int par, int dt[], int low[], boolean vis[], int time){
        // System.out.print(curr+" ");
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);//e.src------e.dest
            if(e.dest == par){
                continue;
            }
            else if(! vis[e.dest]){
                dfs(graph, e.dest, curr, dt, low,vis, time);
                System.out.println(curr +" in else if");
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] < low[e.dest]){
                    System.out.println("dt[curr]"+" "+dt[curr]+" low[e.dest] "+low[e.dest]);
                    System.out.println("Bridge: "+curr+"-------"+e.dest);
                }
            }else{
                System.out.println(curr+" in else");
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }
    public static void createGraph(ArrayList<Edge>graph[], int edges[][]){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < edges.length; i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            Edge e = new Edge(src, dest);
            graph[src].add(e);
        }
       
    }
    public static void main(String[] args) {
        // int edges[][] = {{0,1},{0,2},{0,3},
        //                 {1,0},{1,2},
        //                 {2,0},{2,1},
        //                 {3,0},{3,4},{3,5},
        //                 {4,3},{4,5},
        //                 {5,3},{5,4}};
        int edges[][] = {{0,1},{0,2},{0,3},
                        {1,0},{1,2},
                        {2,0},{2,1},
                        {3,0},{3,4},
                        {4,3}};
        ArrayList<Edge>[]graph = new ArrayList[edges.length];
        createGraph(graph, edges);
        tarjansBridge(graph);

    }
}
