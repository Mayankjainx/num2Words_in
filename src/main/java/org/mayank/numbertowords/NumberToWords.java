package org.mayank.numbertowords;

/**
 * A lightweight utility to convert numeric values into words,
 * following the Indian numbering system (thousand, lakh, crore).
 *
 * Example:
 *  - 1 → "one"
 *  - 105 → "one hundred and five"
 *  - 1000000 → "ten lakh"
 *
 * Author: Mayank Jain
 * Version: 1.0.0
 */
public class NumberToWords {

    // Words for 0–19
    private static final String[] UNITS = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    // Words for multiples of ten
    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    /**
     * Public method to convert any integer number into words.
     *
     * @param number the numeric value to be converted
     * @return the word representation of the number
     */
    public static String convert(long number) {
        if (number == 0) {
            return "zero";
        }
        return convertIndianSystem(number).trim();
    }

    /**
     * Converts number into words using Indian numbering system
     * (e.g., lakh, crore).
     */
    public static String convertIndianSystem(long n) {
        if (n < 20) {
            return UNITS[(int) n];
        } else if (n < 100) {
            return TENS[(int) n / 10] + ((n % 10 != 0) ? " " + UNITS[(int) n % 10] : "");
        } else if (n < 1000) {
            return UNITS[(int) n / 100] + " hundred"
                    + ((n % 100 != 0) ? " and " + convertIndianSystem(n % 100) : "");
        } else if (n < 100000) {
            return convertIndianSystem(n / 1000) + " thousand"
                    + ((n % 1000 != 0) ? " " + convertIndianSystem(n % 1000) : "");
        } else if (n < 10000000) {
            return convertIndianSystem(n / 100000) + " lakh"
                    + ((n % 100000 != 0) ? " " + convertIndianSystem(n % 100000) : "");
        } else {
            return convertIndianSystem(n / 10000000) + " crore"
                    + ((n % 10000000 != 0) ? " " + convertIndianSystem(n % 10000000) : "");
        }
    }

}
