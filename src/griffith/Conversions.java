/*
Ilia Klodin - 3146179
 */
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

    /*
    Method that converts the given string to an integer.
    It throws a NumberFormatException if the string contains any character other than digits.
    The only exception allowed is a negative sign at the beginning of the string.
     */
    public int stringToInteger(String val) {
        char[] arr = val.toCharArray(); // Convert the string to a char array
        for (int i = 0; i < arr.length; i++) { // iterate through the array
            if (i == 0 && arr[i] == '-') {
                continue; // allow negative sign at the beginning if it occurs
            }
            if (arr[i] < '0' || arr[i] > '9') { // if the character is not a digit
                throw new NumberFormatException("The string must contain only digits."); // throw a NumberFormatException
            }
        }
        return Integer.parseInt(val);
    }

    /*
    A method that converts the given integer to a string.
    Super straightforward, we use the Integer wrapper class's toString method to convert the integer to a string.
     */
    public String integerToString(int val) {
        return Integer.toString(val);
    }

    public String switchCase(String inputString) {
        char[] arr = inputString.toCharArray(); // Convert the string to a char array
        for (int i = 0; i < arr.length; i++) { // iterate through the array
            if (arr[i] >= 'a' && arr[i] <= 'z') { // if the character is a lowercase letter
                arr[i] = Character.toUpperCase(arr[i]); // convert it to uppercase
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') { // if the character is an uppercase letter
                arr[i] = Character.toLowerCase(arr[i]); // convert it to lowercase
            }
        }
        return new String(arr); // return the modified char array as a string
    }
}
