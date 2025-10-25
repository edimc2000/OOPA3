package OOPA3;

/**
 * Helper.java
 * The formatters and other helpers
 * 
 * Author: Eddie
 * Date: 2025-Oct-24
 */



public class Helper {

    /**
     * Formats a decimal number to two decimal places with grouping separators.
     * Returns a string representation of the number formatted according to the
     * default locale's number formatting rules.
     *
     * @param decimal the decimal number to be formatted
     * @return a formatted string representation of the number with two decimal
     *         places and grouping separators (commas for thousands)
     * 
     * 
     * @example
     *          // Returns "1,234.56"
     *          formatTwoDecimals(1234.56789);
     * 
     * @example
     *          // Returns "0.00"
     *          formatTwoDecimals(0.0);
     * 
     * @example
     *          // Returns "999,999.99"
     *          formatTwoDecimals(999999.9994);
     */
    public static String formatTwoDecimals(double decimal) {
        return String.format("%,.2f", decimal);

    }

    /**
     * Formats a week number with leading zero for single-digit weeks.
     * Returns a zero-padded string representation for weeks 1-9, and
     * an empty string for weeks 10 and above.
     *
     * @param weekNumber the week number to format (1-based indexing)
     * @return a string containing "0" for weeks 1-9, or empty string for weeks 10+
     * 
     * 
     * @example
     *          // Returns "0"
     *          formatWeekNumber(5);
     * 
     * @example
     *          // Returns ""
     *          formatWeekNumber(12);
     * 
     * @example
     *          // Returns "0"
     *          formatWeekNumber(9);
     */
    public static String formatWeekNumber(int weekNumber) {
        return (weekNumber <= 9 ? "0" : "") + weekNumber;
    }

    /**
     * Formats information for a single product into a readable string.
     * 
     * @param product the Product object to format
     * @param number  the sequence number of the product
     * @return formatted string containing the product information
     */
    public static String formatSingleProduct(Product product, int number) {
        StringBuilder result = new StringBuilder("Product " + number +
                "\n--------------------------------------------" +
                "\n Product Name\t: " + product.getProductName() +
                "\n Product ID\t: " + product.getProductID() +
                "\n Prices\t\t: " + java.util.Arrays.toString(product.getPrices()) +
                "\n");

        return result.toString();
    }

}
