package griffith;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ConversionsTest {

    /*
     Test cases for dollarToEuro method, assuming the conversion rate is 1.08.
     Since the currency amount can't be negative, the negative test case expects an IllegalArgumentException.
     */

    @Test
    public void testEuroToDollarPos() {
        Conversions conversions = new Conversions();
        assertEquals(1.08, conversions.euroToDollar(1), 0.01);
    }

    @Test
    public void testEuroToDollarNeg() {
        Conversions conversions = new Conversions();
        assertThrows(IllegalArgumentException.class, () -> {
            conversions.euroToDollar(-1);
        });
    }

    @Test
    public void testEuroToDollarZero() {
        Conversions conversions = new Conversions();
        assertEquals(0.0, conversions.euroToDollar(0), 0.01);
    }

    @Test
    public void testEuroToDollarBigVal() {
        Conversions conversions = new Conversions();
        assertEquals(1080000.0, conversions.euroToDollar(1000000), 0.01);
    }
}