import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ModifiedBFS{
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
    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0 ; i < graph.length; i++){
            if(! vis[i]){
                bfsUtil(graph, vis, i);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[]graph, boolean vis[], int src){
        Queue<Integer>q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(! vis[curr]){
                //Visit it
                System.out.print(curr+" ");

                //make visited true
                vis[curr] = true;

                //Add current's neighbours into queue
                for(int i = 0 ; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
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
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
}