package fugures;

import figures.Rectangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 2/28/16.
 */
public class RectangleTest {

    @Test
    public void testRectangleArea(){
        Rectangle r = new Rectangle(2, 3);
        Assert.assertEquals(6, r.calculateArea());
    }
}
