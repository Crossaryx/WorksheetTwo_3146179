/*
Ilia Klodin - 3146179
 */
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

    /*
        Test cases for stringToInteger method.
        The method should convert the given string to an integer.
        If the string does not correspond to a valid integer, it should throw a NumberFormatException.
     */

    @Test
    public void testStringToIntegerValid() {
        Conversions conversions = new Conversions();
        assertEquals(123, conversions.stringToInteger("123"));
    }

    @Test
    public void testStringToIntegerNegative() {
        Conversions conversions = new Conversions();
        assertEquals(-456, conversions.stringToInteger("-456"));
    }

    @Test
    public void testStringToIntegerZero() {
        Conversions conversions = new Conversions();
        assertEquals(0, conversions.stringToInteger("0"));
    }

    @Test
    public void testStringToIntegerInvalid() {
        Conversions conversions = new Conversions();
        assertThrows(NumberFormatException.class, () -> { // again, a lambda expression is used for test case
            conversions.stringToInteger("abc");      // where an exception is expected as an output
        });
    }

    /*
        Test cases for integerToString method.
        The method should convert the given integer to a string.
        Fairly straightforward, I haven't come up with any test cases that would expect an exception.
     */

    @Test
    public void testIntegerToStringPositive() {
        Conversions conversions = new Conversions();
        assertEquals("123", conversions.integerToString(123));
    }

    @Test
    public void testIntegerToStringNegative() {
        Conversions conversions = new Conversions();
        assertEquals("-456", conversions.integerToString(-456));
    }

    @Test
    public void testIntegerToStringZero() {
        Conversions conversions = new Conversions();
        assertEquals("0", conversions.integerToString(0));
    }

    /*
    Test cases for switchCase method.
    If an empty string is passed as an argument, the method should return an empty string.
    If non-letter characters are passed, the method should return the same string.
    Otherwise, the method should return the string with the case of its letters switched.
     */

    @Test
    public void testSwitchCaseAllLower() {
        Conversions conversions = new Conversions();
        assertEquals("SUP", conversions.switchCase("sup"));
    }

    @Test
    public void testSwitchCaseAllUpper() {
        Conversions conversions = new Conversions();
        assertEquals("dude", conversions.switchCase("DUDE"));
    }

    @Test
    public void testSwitchCaseMixed() {
        Conversions conversions = new Conversions();
        assertEquals("RaNdOm StUFF", conversions.switchCase("rAnDoM sTuff"));
    }

    @Test
    public void testSwitchCaseEmpty() {
        Conversions conversions = new Conversions();
        assertEquals("", conversions.switchCase(""));
    }

    @Test
    public void testSwitchCaseNonLetters() {
        Conversions conversions = new Conversions();
        assertEquals("6613135*(#@!", conversions.switchCase("6613135*(#@!"));
    }


}