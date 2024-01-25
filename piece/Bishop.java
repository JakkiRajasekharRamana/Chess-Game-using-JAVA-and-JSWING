package Chess.piece;

import Chess.Gamepanel;

public class Bishop extends Piece {

    public Bishop(int color, int col, int row) {
        super(color, col, row);

        if (color == Gamepanel.WHITE) {
            image = getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/w-bishop");
        } else {
            image = getImage("/home/rajasekhar/java_stuff/Chess/res/Piece/b-bishop");
        }
    }
}

