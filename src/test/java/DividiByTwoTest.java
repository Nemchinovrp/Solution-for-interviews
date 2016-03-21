import org.junit.Assert;
import org.junit.Test;

public class DividiByTwoTest {

    @Test
    public void division8(){
        Assert.assertEquals(3, DividiByTwo.division(8));
    }
    @Test
    public void division256(){
        Assert.assertEquals(8, DividiByTwo.division(256));
    }
}
