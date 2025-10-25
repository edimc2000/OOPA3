package OOPA3;

/**
 * Product.java
 * The Product class represents a product with its name, ID, prices, and sales data.
 * It provides functionality to manage product information, track weekly and monthly sales,
 * calculate averages, sort prices, and display data in various formats.
 * 
 * This class includes static methods for sales analysis and matrix operations,
 * as well as instance methods for product-specific information.
 * 
 * Author: Eddie
 * Date: 2025-Oct-24
 */

import static java.lang.System.out;
import java.util.Arrays;

public class Product {

    // part 1.1
    /** The name of the product */
    private String productName;

    /** The unique identifier for the product */
    private int productID;

    /** Array of prices for the product */
    private Double[] prices;

    // part 1.5 Declare an integer array named "weeklySales" with a capacity of 40
    /** Array to store weekly sales data with capacity for 40 weeks */
    private static int[] weeklySales = new int[40];

    // part 2.1
    /** 2D array to store monthly sales data (3 months x 4 weeks) */
    private static int[][] monthlySales = new int[3][4];

    // part 4.1
    /** 5x5 matrix for general purpose data storage */
    private static int[][] matrix = new int[5][5];

    // setters and getters

    /**
     * Gets the product name
     * 
     * @return the name of the product
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Gets the product ID
     * 
     * @return the unique identifier of the product
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Gets the prices array
     * 
     * @return array of prices for the product
     */
    public Double[] getPrices() {
        return prices;
    }

    /**
     * Gets the monthly sales data
     * 
     * @return 2D array containing monthly sales data
     */
    public static int[][] getMonthlySales() {
        return monthlySales;
    }

    /**
     * Gets the weekly sales data
     * 
     * @return array containing weekly sales data
     */
    public static int[] getWeeklySales() {
        return weeklySales;
    }

    /**
     * Gets the matrix data
     * 
     * @return 2D array representing the matrix
     */
    public static int[][] getMatrix() {
        return matrix;
    }

    /**
     * Sets the matrix with new data
     * 
     * @param array the new 2D array to set as matrix
     */
    public static void setMatrix(int[][] array) {
        matrix = array;
    }

    // part 1.6 initializing weeklySales
    /**
     * Sets the weekly sales data by copying the provided array
     * 
     * @param array the array containing weekly sales data to copy
     */
    public static void setWeeklySales(int[] array) {
        weeklySales = Arrays.copyOf(array, array.length);
    }

    // part 2.1
    /**
     * Populates the monthly sales data by grouping weekly sales into months.
     * Assumes 4 weeks per month and 3 months total.
     */
    public static void setMonthlySales() {
        for (int i = 0; i < 3; i++) {
            int start = i * 4;
            int end = start + 4;
            monthlySales[i] = Arrays.copyOfRange(weeklySales, start, end);
        }
    }

    // part 1.2 implementing a constructor
    /**
     * Constructs a new Product with the specified name, ID, and prices.
     * 
     * @param productName the name of the product
     * @param productID   the unique identifier for the product
     * @param prices      array of prices for the product
     */
    Product(String productName, int productID, Double[] prices) {
        this.productName = productName;
        this.productID = productID;
        this.prices = prices;
    }

    // part 1.4
    /**
     * Displays information for all products in the array in a formatted string.
     * 
     * @param array the array of Product objects to display
     * @return formatted string containing information for all products
     */
    public static String displayProductInfo(Product[] array) {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (Product product : array) {
            result.append(formatSingleProduct(product, counter++));
        }
        return result.toString();
    }

    /**
     * Formats information for a single product into a readable string.
     * 
     * @param product the Product object to format
     * @param number  the sequence number of the product
     * @return formatted string containing the product information
     */
    private static String formatSingleProduct(Product product, int number) {
        return "Product " + number +
                "\n--------------------------------------------" +
                "\n Product Name\t: " + product.productName +
                "\n Product ID\t: " + product.productID +
                "\n Prices\t\t: " + java.util.Arrays.toString(product.prices) +
                "\n";
    }

    // part 1.7
    /**
     * Displays weekly sales data in a formatted string with proper formatting.
     * 
     * @return formatted string showing all weekly sales with week numbers and
     *         formatted amounts
     */
    public static String showWeeklySales() {
        StringBuilder result = new StringBuilder("\nWeekly  Sales: " +
                "\n--------------------------------------------");
        int counter = 1;
        for (int element : getWeeklySales()) {
            result.append("\n Week " + Helper.formatWeekNumber(counter) + " \t: $ ");
            result.append(Helper.formatTwoDecimals(element));
            counter++;
        }
        return result.toString();
    }

    // part 2.2 and display monthlySales
    /**
     * Displays monthly sales data in a formatted string.
     * 
     * @return formatted string showing monthly sales with month numbers
     */
    public static String showMonthlySales() {
        StringBuilder result = new StringBuilder("\nWeekly  Sales: " +
                "\n--------------------------------------------");
        int monthCount = 1;
        for (int[] element : monthlySales) {
            result.append("\n Month " + monthCount + "\t: " +
                    java.util.Arrays.toString(element));
            monthCount += 1;
        }
        return result.toString();
    }

    // part 3.1 per requirement - passing standard int array
    /**
     * Calculates the average sales from an array of sales data.
     * 
     * @param array the array of sales data
     * @return formatted string representing the average sales value
     */
    public static String findAverageSales(int[] array) {
        Double total = 0.00;
        for (int element : array) {
            total += (double) element;
        }
        return Helper.formatTwoDecimals(total / array.length);
    }

    // part 3.1 improvement overload, with additional params for the month
    /**
     * Calculates the average sales for a specific month.
     * 
     * @param array the 2D array containing monthly sales data
     * @param month the month number (1-based index)
     * @return formatted string showing the average sales for the specified month
     */
    public static String findAverageSales(int[][] array, int month) {
        int[] salesForMonth = array[month - 1];
        Double total = 0.00;
        for (int i = 0; i < salesForMonth.length; i++) {
            total += (double) salesForMonth[i];
        }
        return "Average sales for Month " + month + "\t: " + Helper.formatTwoDecimals(total / salesForMonth.length);
    }

    // part 3.2 overload for weekly sales with period
    /**
     * Calculates the average sales for a specific range of weeks.
     * 
     * @param array     the array containing weekly sales data
     * @param weekStart the starting week number (1-based index)
     * @param weekEnd   the ending week number (1-based index)
     * @return formatted string showing the average sales for the specified week
     *         range
     */
    public static String findAverageSales(int[] array, int weekStart, int weekEnd) {
        Double total = 0.00;
        for (int i = (weekStart - 1); i < (weekEnd); i++) {
            total += array[i];
        }
        return "Average sales from  week " + weekStart + " to week  " + weekEnd + "\t: " +
                Helper.formatTwoDecimals(total / (weekEnd - weekStart + 1));

    }

    // part 3.3 Implement a method named sortPrices that takes an array of doubles
    // as a parameter
    /**
     * Sorts an array of prices in ascending order and returns the sorted array as a
     * string.
     * 
     * @param array the array of Double prices to sort
     * @return string representation of the sorted prices array
     */
    public static String sortPrices(Double[] array) {
        Arrays.sort(array);
        String result = java.util.Arrays.toString(array);
        return result;
    }

    // part 4.2 nested for-each loops to display the elements of the "matrix" array
    // in grid format
    /**
     * Displays a 2D matrix array in grid format.
     * 
     * @param array the 2D array to display
     * @return formatted string showing the matrix in grid format
     */
    public static String displayMatrix(int[][] array) {
        StringBuilder result = new StringBuilder(" \nTwo-Dimensional Array:" +
                "\n--------------------------------------------\n");
        for (int[] rowElement : array) {
            for (int element : rowElement) {
                result.append(element + " ");
            }
            result.append("\n");
        }
        return result.toString();
    }

}