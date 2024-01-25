package Chess;

import javax.swing.JFrame;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        

        // Gamepanel is added here
        Gamepanel gp = new Gamepanel();
        window.add(gp);
        window.pack();
        

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();

    }
}

