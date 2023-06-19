import java.util.ArrayList;

public class CycleDetectionUsingGraph {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static boolean dfs(ArrayList<Edge>[]graph){
        boolean vis[]= new boolean[graph.length];
        for(int i = 0 ; i < graph.length; i++){ //for disjoint components
            if(! vis[i]){
                if(dfsUtilIsCycle(graph, i, -1, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    //O(V+E)
    public static boolean dfsUtilIsCycle(ArrayList<Edge>[]graph, int curr, int par, boolean visited[]){
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i = 0 ; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //case 3
            if(!visited[e.dest]){
                if(dfsUtilIsCycle(graph, e.dest, curr, visited)){
                    return true;
                }
                    
            }
            //case 1
            else if(visited[e.dest] && e.dest != par){
                return true;
            }
            //case 2 => continue 
        }
        return false;
    }
    // public static void dfsUtil(ArrayList<Edge>[]graph, int curr, boolean visited[]){
    //     System.out.print(curr+" ");
    //     visited[curr] = true;

    //     for(int i = 0 ; i < graph[curr].size(); i++){
    //         Edge e = graph[curr].get(i);

    //         if(!visited[e.dest]){
    //             dfsUtil(graph, e.dest, visited);
    //         }
    //     }
    // }
    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(0, 0));
        graph[1].add(new Edge(0, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 4));
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph);
       System.out.println( dfs(graph));
    }
}
