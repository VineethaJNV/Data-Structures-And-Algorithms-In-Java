import java.util.*;
public class CreateAdjacencyList{
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
    public static void main(String[] args) {

        /*      (5)
            0 ------- 1
                    /   \
              (1)  /     \ (3)
                  /       \
                 2---------3
                 |  (1)
              (2)|
                 |
                 4*/
        int V = 5;
        ArrayList<Edge>[]graph = new ArrayList[V]; //null stored => initialize with empty arraylist

        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        //Storing vertices

        //0 vertices
        graph[0].add(new Edge(0, 1, 5));

        //1 vertices
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 vertices
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));

        //3 vertices
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4 vertices
        graph[4].add(new Edge(4, 2, 2));

        //2's neighbours
        for(int i = 0 ; i < graph[2].size(); i++){
            System.out.print(graph[2].get(i).dest+" ");
        }
    }
}