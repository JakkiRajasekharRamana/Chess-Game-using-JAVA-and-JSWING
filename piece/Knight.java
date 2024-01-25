package Chess.piece;

import Chess.Gamepanel;

public class Knight extends Piece{
    public Knight(int color,int col,int row){
        super(color,col,row);

        if(color== Gamepanel.WHITE){
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/w-knight");
        }
        else{
            image=getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/b-knight");
        }
    }
}
