package Chess;


//THis is GAme Screen;

import javax.swing.JPanel;

import Chess.piece.Pawn;
import Chess.piece.King;
import Chess.piece.Knight;
import Chess.piece.Piece;
import Chess.piece.Queen;
import Chess.piece.Rook;
import Chess.piece.Bishop;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Gamepanel extends JPanel implements Runnable  {
    public static final int WIDTH=1100;
    public static final int HEIGHT=800;

    final int FPS=60;
    Thread gameThread;
    Board board=new Board();


    //PIECES
    public static ArrayList<Piece> pieces=new ArrayList<>();//Backuplist/reset list
    public static ArrayList<Piece> simPieces=new ArrayList<>();
    
    //COLOR
    public static final int WHITE=0;
    public static final int BLACK=1;
    int currentColor=WHITE;//White starts first bruhh

    //default Constructor
    public Gamepanel(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black);

        setPieces();
        copyPieces(pieces,simPieces);
        //Some remain the same as we change the pieses

    }

    public void launchGame(){
        gameThread= new Thread(this);
        gameThread.start(); //initalizing thread and cain run method here
    }

    public void setPieces(){


        //WHITE BOII
        pieces.add(new Pawn(WHITE,0,6));
        pieces.add(new Pawn(WHITE,1,6));
        pieces.add(new Pawn(WHITE,2,6));
        pieces.add(new Pawn(WHITE,3,6));
        pieces.add(new Pawn(WHITE,4,6));
        pieces.add(new Pawn(WHITE,5,6));
        pieces.add(new Pawn(WHITE,6,6));
        pieces.add(new Pawn(WHITE,7,6));
        pieces.add(new Rook(WHITE,0,7));
        pieces.add(new Rook(WHITE,7,7));
        pieces.add(new Knight(WHITE,1,7));
        pieces.add(new Knight(WHITE,6,7));
        pieces.add(new Bishop(WHITE,2,7));
        pieces.add(new Bishop(WHITE,5,7));
        pieces.add(new Queen(WHITE,3,7));
        pieces.add(new King(WHITE,4,7));
        
        //BLack Pieces

        pieces.add(new Pawn(BLACK,0,1));
        pieces.add(new Pawn(BLACK,1,1));
        pieces.add(new Pawn(BLACK,2,1));
        pieces.add(new Pawn(BLACK,3,1));
        pieces.add(new Pawn(BLACK,4,1));
        pieces.add(new Pawn(BLACK,5,1));
        pieces.add(new Pawn(BLACK,6,1));
        pieces.add(new Pawn(BLACK,7,1));
        pieces.add(new Rook(BLACK,0,0));
        pieces.add(new Rook(BLACK,7,0));
        pieces.add(new Knight(BLACK,1,0));
        pieces.add(new Knight(BLACK,6,0));
        pieces.add(new Bishop(BLACK,2,0));
        pieces.add(new Bishop(BLACK,5,0));
        pieces.add(new Queen(BLACK,3,0));
        pieces.add(new King(BLACK,4,0));
        
    }

    private void copyPieces(ArrayList<Piece> source,ArrayList<Piece> target){

        target.clear();
        for(int i=0;i<source.size();i++){
            target.add(source.get(i));
        }
    }

    @Override
    public void run(){
        //Creating a game loop
        
        //Findinf time interwal btw each frame
        double drawInterval=1000000000/FPS;

        double delta=0;
        long lastTime=System.nanoTime();
        long currentTime;

        while(gameThread != null){

            currentTime=System.nanoTime();
            //cuurent time in nanosec
            delta=delta+(currentTime-lastTime)/drawInterval;
            //adding elapsed time since last frame was passed
            lastTime=currentTime;
            //updating the past time to present time
            if(delta>=1){
                //checking if current time is passed as per fps
                //BASICY CHANGING EVERY 1/60 of a sec
                update();
                repaint();
                delta--;
                //reesttign delta
            }
        }
    }

    public void update(){
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2= (Graphics2D)g;

        //Board
        board.draw(g2);
    
        //PIECES
        for(Piece p:simPieces){
            p.draw(g2);
        }
    }
    
}
