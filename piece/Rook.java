package Chess.piece;

import Chess.Gamepanel;

public class Rook extends Piece{
    public Rook(int color,int col,int row){
        super(color,col,row);

        if(color== Gamepanel.WHITE){
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/w-rook");
        }
        else{
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/b-rook");
        }
    }
}
