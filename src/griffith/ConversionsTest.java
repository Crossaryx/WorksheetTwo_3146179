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
        assertThrows(IllegalArgumentException.class, () -> { // here I used a lambda expression
            conversions.euroToDollar(-1); // it calls the euroToDollar method with -1 as an argument and expects an IllegalArgumentException
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

    /*
        Test cases for dollarToEuro method, assuming the conversion rate is 0.93(rounded from 0.9259)
        Same as for euroToDollar, the negative test case expects an IllegalArgumentException.
     */

    @Test
    public void testDollarToEuroPos() {
        Conversions conversions = new Conversions();
        assertEquals(0.93, conversions.dollarToEuro(1), 0.01);
    }

    @Test
    public void testDollarToEuroNeg() {
        Conversions conversions = new Conversions();
        assertThrows(IllegalArgumentException.class, () -> { // same lambda expression is used as in the euroToDollar test case
            conversions.dollarToEuro(-1);
        });
    }

    @Test
    public void testDollarToEuroZero() {
        Conversions conversions = new Conversions();
        assertEquals(0.0, conversions.dollarToEuro(0), 0.01);
    }

    @Test
    public void testDollarToEuroBigVal() {
        Conversions conversions = new Conversions();
        assertEquals(1148147.31, conversions.dollarToEuro(1234567), 0.01);
    }
}