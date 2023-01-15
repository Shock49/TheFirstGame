import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GameWindow extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    private final GameCanva gameCanva;
    private final Sprite[] gameObject = new Sprite[2];

    private final JPanel panelTop = new JPanel(new GridLayout(1,3));
    private ArrayList<Sprite> sprites = new ArrayList<>();

    //private KeyHandler keyHandler = new KeyHandler();;



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameWindow());
    }

    GameWindow(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setTitle("PingPong");
        setResizable(false);

        gameCanva = new GameCanva(this);
        add(gameCanva,BorderLayout.CENTER);
        sprites.add(new Hero(this));
        //this.addKeyListener(keyHandler);

        setVisible(true);
    }


    public void onDrowFrame(GameCanva gameCanva, Graphics g){
        update(gameCanva);
        render(gameCanva, g);
    }

    private void render(GameCanva gameCanva, Graphics g) {
        for (Sprite sprite :
                sprites) {
            sprite.render(g);
        }
    }

    private void update(GameCanva gameCanva) {
        for (Sprite sprite :
                sprites) {
            sprite.update();
        }
    }
}
