import java.awt.*;

public abstract class Sprite  {

    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    protected float getLeft(){return x - halfWidth;}
    protected float getRight() { return x + halfWidth;}
    protected float getTop(){ return y - halfHeight;}
    protected float getBottom(){ return y + halfHeight;}

    protected void setLeft(float left){x = left + halfWidth;}
    protected void setRight(float right){ x = right - halfWidth;}
    protected void setTop(float top){ y = top + halfHeight;}
    protected void setBottom(float bottom){ y = bottom - halfHeight;}

    protected float getWidth() { return 2f * halfWidth;}
    protected float getHeight() { return 2f * halfHeight;}

    public void render(Graphics g){};
    public void update( ){};
}
