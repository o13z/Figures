package fugures;

import figures.Square;
import org.junit.Test;
import org.junit.Assert;

public class SquareTest {

    @Test
    public void testSquare(){
        Square sq = new Square(2);
        Assert.assertEquals(4, sq.calculateArea());
    }

}
