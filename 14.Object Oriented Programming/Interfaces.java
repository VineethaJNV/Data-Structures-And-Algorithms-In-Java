public class Interfaces {
    // Classes are Extended
    //Interfaces are Implemented
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{//The type Queen must implement the inherited abstract method chessPlayer.moves()
    public void moves(){ // => public is necessary otherwise it is default
        System.out.println("Up, Down, Left, Right, Diagonal in all 4 directions");
    }
}
class Rook implements chessPlayer{//The type Queen must implement the inherited abstract method chessPlayer.moves()
    public void moves(){ // => public is necessary otherwise it is default
        System.out.println("Up, Down, Left, Right");
    }
}
class King implements chessPlayer{//The type Queen must implement the inherited abstract method chessPlayer.moves()
    public void moves(){ // => public is necessary otherwise it is default
        System.out.println("Up, Down, Left, Right, diagonal  only one step");
    }
}

