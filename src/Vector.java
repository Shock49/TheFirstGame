public class Vector {
    private float x;
    private float y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void addLeft(float x){
        this.x -= x;
    }
    public void addRight(float x){
        this.x += x;
    }
    public void addTop(float y){
        this.y -= y;
    }
    public void addBot(float y){
        this.y += y;
    }

}
