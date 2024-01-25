package Chess.piece;

import Chess.Gamepanel;

public class Queen extends Piece{
    public Queen(int color,int col,int row){
        super(color,col,row);

        if(color== Gamepanel.WHITE){
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/w-queen");
        }
        else{
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/b-queen");
        }
    }
}