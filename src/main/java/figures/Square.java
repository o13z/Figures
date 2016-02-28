package figures;

/**
 * Created by user on 2/28/16.
 */
public class Square implements Figure {
    private int x;

    public Square(int x) {
        this.x = x;
    }

    public int calculateArea() {
        return x*x;
    }
}
