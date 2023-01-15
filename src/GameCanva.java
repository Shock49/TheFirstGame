import javax.swing.*;
import java.awt.*;

public class GameCanva extends JPanel {
    private GameWindow gameWindow;

    private final long DROW_INTERVAL = 1_000_000_000/60; //nanosec
    private int countFPS;
    private int second;
    private long sleepTime;

    public GameCanva(GameWindow gameWindow) {
        setBackground(Color.BLACK);
        this.gameWindow = gameWindow;
        setSize(gameWindow.getWidth(),gameWindow.getHeight());
        countFPS = 0;
        second = 0;
        sleepTime = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        long nextTime = System.nanoTime() + DROW_INTERVAL;
        super.paintComponent(g);
        gameWindow.onDrowFrame(this,g);
        countFPS++;
        if (countFPS >= 60){
            second++;
            System.out.println("FPS: " + countFPS + " Second:" + second );
            countFPS = 0;
        }

        sleepTime = (long)((nextTime - System.nanoTime() ) * 0.000_001f);
        if(sleepTime > 0) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        repaint();
    }
    public int getLeft(){ return 0;}
    public int getRight(){ return getWidth() - 1;}
    public int getTop(){ return 0;}
    public int getBottom(){ return getHeight() - 1;}
}
