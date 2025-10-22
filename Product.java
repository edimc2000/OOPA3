package OOPA3;

import static java.lang.System.out;

import java.util.Arrays;



public class Product {

    // part 1.1
    private String productName;
    private int productID;
    private Double[] prices;

    // part 1.5 Declare an integer array named "weeklySales" with a capacity of 40
    private static int[] weeklySales = new int[40];

    // setters and getters
    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public Double[] getPrices() {
        return prices;
    }

    // part 1.2 implementing a constructor
    Product(String productName, int productID, Double[] prices) {
        this.productName = productName;
        this.productID = productID;
        this.prices = prices;

        // part 1.6 Sales for a quarter (3 months)
        int[] oneQuarterSales = { 29802, 31567, 28451, 30289, 29123, 30876, 29745, 31234, 28679, 30555, 29321,
                30987, 30123 };

        // part 1.6 initializing weeklySales
        weeklySales = Arrays.copyOf(oneQuarterSales, weeklySales.length);

    }

    // @Override
    public String displayProductInfo(int i) {
        return "Product " + (i + 1) +
                " --------------------------------------------" +
                "\n Product Name\t: " + productName +
                "\n Product ID\t: " + productID +
                "\n Prices\t\t: " + java.util.Arrays.toString(prices);
    }

    public static String showWeeklySales() {
        String result = "Weekly Sales \n";
        for (int i = 0; i < weeklySales.length; i++) {
            result += " Week " +
                    (i < 9 ? "0" : "") +
                    String.valueOf(i + 1) +
                    "\t: " +
                    formatTwoDecimals(weeklySales[i]) +
                    "\n";
        }
        return result;
    }

    /**
     * Formats a decimal number to two decimal places with grouping separators.
     * Returns a string representation of the number formatted according to the
     * default locale's number formatting rules.
     *
     * @param decimal the decimal number to be formatted
     * @return a formatted string representation of the number with two decimal
     *         places and grouping separators (commas for thousands)
     * 
     * @throws IllegalArgumentException if the decimal value is NaN or infinite
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
}