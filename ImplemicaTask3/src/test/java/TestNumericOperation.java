import org.junit.Assert;
import org.junit.Test;

/**
 * TestNumericOperation is the test class
 * for testing NumericOperation.
 *
 * @author    Denys Honcharenko
 */
public class TestNumericOperation {

    /**
     * The positive test method for testing sumDigitsInFactorialNumber method.
     */
    @Test
    public void testSumDigitsInFactorialNumber(){
        int expected = 648;
        int actual = NumericOperation.sumDigitsInFactorialNumber(100);

        Assert.assertEquals(expected, actual);
    }
}
