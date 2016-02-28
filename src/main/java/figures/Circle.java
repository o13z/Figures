package figures;

/**
 * Created by user on 2/28/16.
 */
public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
