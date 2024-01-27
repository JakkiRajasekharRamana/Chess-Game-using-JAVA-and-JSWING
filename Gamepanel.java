package Chess;
//THis is genreal insite of GAme Screen;

import javax.swing.JPanel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class Gamepanel extends JPanel implements Runnable  {
    public static final int WIDTH=1100;
    public static final int HEIGHT=800;

    final int FPS=60;
    Thread gameThread;

    //default Constructor
    public Gamepanel(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.black);
    }

    public void launchGame(){
        gameThread= new Thread(this);
        gameThread.start(); //initalizing thread and caallin run method here
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
                //BASICALLY CHANGING EVERY 1/60 of a sec
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
    }
    
}
