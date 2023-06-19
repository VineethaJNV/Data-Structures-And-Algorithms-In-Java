import java.util.ArrayList;
public class TarjansArticulation {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }//O(V+E)
    public static void dfs(ArrayList<Edge>graph[], int curr, int dt[], int low[], int par, int time, boolean vis[], boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++ time;
        int children = 0;

        for(int i = 0 ; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(par == e.dest){
                continue;
            }else if(vis[e.dest]){
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }else{
                dfs(graph, e.dest, dt, low, curr, time, vis, ap);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(par != -1 && dt[curr] <= low[e.dest]){
                    ap[curr] = true;
                }
                children++;
            }

        }
        if(par == -1 && children > 1){
            // System.out.println("AP : "+curr);
            ap[curr] = true;
        }
    }
    public static void tarjansArticulationP(ArrayList<Edge>graph[], int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean[] vis = new boolean[V];
        boolean ap[] = new boolean[V];
        for(int i = 0 ;  i < graph.length; i++){
            if(! vis[i]){
                dfs(graph, i, dt, low, -1, 0, vis, ap);
            }
        }
        //Printing all AP's
        for(int i = 0 ; i < ap.length; i++){
            if(ap[i]){
                System.out.println("AP : "+ i);
            }
        }

    }
    public static void createGraph(ArrayList<Edge>[]graph, int edges[][]){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i  < edges.length ;i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            Edge e = new Edge(src, dest);

            graph[src].add(e);
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int edges[][] = {{0,1},{0,2},{0,3},{1,0},{1,2},{2,1},{2,0},{3,0},{3,4},{4,3}};
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph, edges);
        tarjansArticulationP(graph, V);
    }
}
