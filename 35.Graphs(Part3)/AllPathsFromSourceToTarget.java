import java.util.ArrayList;

public class AllPathsFromSourceToTarget {
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

   public static void findAllPaths(ArrayList<Edge>[]graph, int src, int dest, String path){
    if(src == dest){
        System.out.println(path+dest);
        return;
    }
    for(int i = 0 ; i < graph[src].size(); i++){
        Edge e = graph[src].get(i);
        findAllPaths(graph, e.dest, dest, path+src);

    }
   }
    public static void createGraph( ArrayList<Edge>[]graph){
        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[0].add(new Edge(0, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        // for(int i = 0 ; i < edges.length; i++){
        //     int src = edges[i][0];
        //     int dest = edges[i][1];
        //     System.out.println("src: "+src+" dest: "+dest);
        //     graph[i].add(new Edge(src,dest ));
        // }
        
    }
    
    public static void main(String[] args) {
        /*    5     4
         *    | \ / |
         *    |  0  |
              2     1
               \   /
                 3
         */ 
        // int edges[][] = {{0,3},{2,3},{3,1},{4,0},{4,1},{5,0},{5,2}};
        ArrayList<Edge>[]graph = new ArrayList[7];
        createGraph(graph);
        int src = 5;
        int dest = 1;
        ArrayList<Integer>result = new ArrayList<>();
        findAllPaths(graph, src, dest, "");

    }
}
