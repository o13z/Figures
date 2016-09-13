package fugures;

import figures.Circle;
import org.junit.Assert;
import org.junit.Test;
//test
/**
 * Created by user on 2/28/16.
 */
public class CircleTest {

    @Test
    public void testCircleArea() {
        Circle c = new Circle(4);
        Assert.assertEquals(50,Math.round(c.calculateArea()));
    }

}
