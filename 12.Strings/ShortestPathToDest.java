public class ShortestPathToDest {
    //Given a route containing 4 directions (E, W, N, S), Find the shortest path to reach the destination
    public static int findSmallestPath(String str){ //dispacement
        int x = 0;
        int  y = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == 'W'){ // West
                x--;
            }else if(str.charAt(i) == 'E'){ //East
                x++;
            }else if(str.charAt(i) == 'N'){ //North
                y++;
            }else{
                y--;    //South
            }
        }
        return (int)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
    }
    public static void main(String[] args){
        String route = "WNEENESENNN";
        System.out.println(findSmallestPath(route));
    }
}
