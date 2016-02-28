package figures;

/**
 * Created by user on 2/28/16.
 */
public class Rectangle implements Figure {

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculateArea() {
        return x*y;
    }
}
