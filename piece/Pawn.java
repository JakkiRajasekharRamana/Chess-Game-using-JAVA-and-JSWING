package Chess.piece;

import Chess.Gamepanel;


public class Pawn extends Piece{


    public Pawn(int color,int col, int row){
        super(color,col,row);
        //super is used to inoke the contructor of the superclass
        if(color == Gamepanel.WHITE){
            image =getImage("/piece/w-pawn");
        }
        else{
            image =getImage("/piece/b-pawn");
        }
    }
}
