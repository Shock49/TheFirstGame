import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private boolean isPresdUp = false;
    private boolean isPresdDown = false;
    private boolean isPresdLeft = false;
    private boolean isPresdRight = false;
    char a ;

    public boolean isPresdUp() {
        return isPresdUp;
    }

    public boolean isPresdDown() {
        return isPresdDown;
    }

    public boolean isPresdLeft() {
        return isPresdLeft;
    }

    public boolean isPresdRight() {
        return isPresdRight;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP -> isPresdUp = true;
            case KeyEvent.VK_DOWN -> isPresdDown = true;
            case KeyEvent.VK_LEFT -> isPresdLeft = true;
            case KeyEvent.VK_RIGHT -> isPresdRight = true;
            default -> throw new RuntimeException("Uncnow source code key: " + e.getKeyCode());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP -> isPresdUp = false;
            case KeyEvent.VK_DOWN -> isPresdDown = false;
            case KeyEvent.VK_LEFT -> isPresdLeft = false;
            case KeyEvent.VK_RIGHT -> isPresdRight = false;
            default -> throw new RuntimeException("Uncnow source code key: " + e.getKeyCode());
        }
    }
}
