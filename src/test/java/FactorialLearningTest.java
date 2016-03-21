import org.junit.Assert;
import org.junit.Test;

public class FactorialLearningTest {

    @Test
    public void sumFact(){
        Assert.assertEquals(3, FactorialLearning.sumFactNumber(FactorialLearning.fact(5)));
    }
}
