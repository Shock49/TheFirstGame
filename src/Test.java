public class Test {
    public static void main(String[] args) {
        double ax = -19;
        double ay = 0;
        double bx = 0;
        double by = -100;

        double len = ax * bx + ay * by;
        double am = Math.sqrt(ax * ax + ay * ay);
        double bm = Math.sqrt(bx * bx + by * by);
        double cos = len / am * bm;
        double acos = Math.acos(cos);
        double angle = Math.toDegrees(acos);

        System.out.println("cos: " + cos + "\n acos: " + acos + "\n angle: " + angle);
    }
}
