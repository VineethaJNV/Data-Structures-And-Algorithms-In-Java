import java.util.ArrayList;

public class ModefiedDFS {
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
    public static void dfs(ArrayList<Edge>graph[], int curr){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(! vis[i]){
                dfsUtil(graph, curr, vis);  
            }
           
        }
    }
    public static void dfsUtil(ArrayList<Edge>[]graph, int curr, boolean vis[]){
        System.out.print(curr +" ");

        vis[curr] = true;

        for(int i = 0 ;  i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(! vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 1, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }
    public static void main(String[] args) {
        /*           1-----------3
         *          /            |\   
         *        0              | 5------6    
         *          \            |/
         *           2-----------4
         */
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfs(graph, 0);
    }
}
