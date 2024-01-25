package Chess.piece;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

import Chess.Board;

public class Piece {
    
    public BufferedImage image;
    public int x,y;
    public int col,row,preCol,preRow;
    public int color;

    //Parametric Contructor
    public Piece(int color,int col,int row){
        
        this.color=color;
        this.col=col;
        this.row=row;
        x=getX(col);
        y=getY(row);
        preCol=col;
        preRow=row;
    }

    public BufferedImage getImage(String imagePath){

        BufferedImage image=null;

        try{
            image=ImageIO.read(getClass().getResourceAsStream(imagePath+".png"));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return image;
    }
    public int getX(int col){
        return col * Board.SQUARE_SIZE;
    }
    public int getY(int row){
        return row * Board.SQUARE_SIZE;
    }

    //Drawing the pieces
    public void draw(Graphics2D g2){
        g2.drawImage(image,x,y,Board.SQUARE_SIZE,Board.SQUARE_SIZE,null);
    }
}
