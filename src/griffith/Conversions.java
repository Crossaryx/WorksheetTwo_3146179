package griffith;

public class Conversions {
    /*
     Completed method that converts the given euro amount to dollar amount with the conversion rate of 1.08.
     If the passed euro amount is negative, it throws an IllegalArgumentException.
     */
    public double euroToDollar(double euro) {
        if (euro < 0) {
            throw new IllegalArgumentException("The currency amount can't be negative.");
        }
        return euro*1.08;
    }

    /*
    Same as euroToDollar essentially, except the conversion rate is 0.93(rounded from 0.9259).
     */
    public double dollarToEuro(double dollar) {
        if (dollar < 0) {
            throw new IllegalArgumentException("The currency amount can't be negative.");
        }
        return dollar*0.93;
    }

    public int stringToInteger(String val) {
        return 0;
    }

    public String integerToString(int val) {
        return "";
    }

    public String switchCase() {
        return "";
    }
}
