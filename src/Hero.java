import java.awt.*;

public class Hero extends Sprite {
    private final float WIDTH = 50;
    private final float HEIGHT = 50;
    private final float STEP = 5;

    private Vector vector ;
    GameWindow gameWindow;
    private KeyHandler keyHandler = new KeyHandler();;


    public Hero(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        vector = new Vector(10,50);
        this.gameWindow.addKeyListener(keyHandler);
    }

    public void render(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval((int)vector.getX(),(int)vector.getY(),(int)WIDTH,(int)HEIGHT);

    }
    public void update(){
        if(keyHandler.isPresdUp()) vector.addTop(STEP);
        if(keyHandler.isPresdDown()) vector.addBot(STEP);
        if(keyHandler.isPresdLeft()) vector.addLeft(STEP);
        if(keyHandler.isPresdRight()) vector.addRight(STEP);
    }
}
