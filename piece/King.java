package Chess.piece;

import Chess.Gamepanel;

public class King extends Piece{
    public King(int color,int col,int row){
        super(color,col,row);

        if(color== Gamepanel.WHITE){
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/w-king");
        }
        else{
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/w-king");
        }
    }
}