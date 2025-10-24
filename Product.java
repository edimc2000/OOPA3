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

    // part 2.1
    private static int[][] monthlySales = new int[3][4];

    // part 4.1
    private static int[][] matrix = new int[5][5];

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

    public static int[][] getMonthlySales() {
        return monthlySales;
    }

    public static int[] getWeeklySales() {
        return weeklySales;
    }

    public static int[][] getMatrix() {
        return matrix;
    }

    public static void setMatrix(int[][] array) {
        matrix = array;
    }

    public static void setWeeklySales(int[] array) {
        // part 1.6 initializing weeklySales
        weeklySales = Arrays.copyOf(array, array.length);
    }

    public static void setMonthlySales() {
        // part 2.1
        for (int i = 0; i < 3; i++) {
            int start = i * 4;
            int end = start + 4;
            monthlySales[i] = Arrays.copyOfRange(weeklySales, start, end);
        }

    }

    // part 1.2 implementing a constructor
    Product(String productName, int productID, Double[] prices) {
        this.productName = productName;
        this.productID = productID;
        this.prices = prices;
    }

    // part 1.4
    public static String displayProductInfo(Product[] array) {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (Product product : array) {
            result.append(formatSingleProduct(product, counter++));
        }
        return result.toString();
    }

    private static String formatSingleProduct(Product product, int number) {
        return "Product " + number +
                "\n--------------------------------------------" +
                "\n Product Name\t: " + product.productName +
                "\n Product ID\t: " + product.productID +
                "\n Prices\t\t: " + java.util.Arrays.toString(product.prices) +
                "\n";
    }

    // part 1.7
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
    public static String findAverageSales(int[] array) {
        Double total = 0.00;
        for (int element : array) {
            total += (double) element;
        }
        return Helper.formatTwoDecimals(total / array.length);
    }

    // part 3.1 improvement overload, with additional params for the month
    public static String findAverageSales(int[][] array, int month) {
        int[] salesForMonth = array[month - 1];
        Double total = 0.00;
        for (int i = 0; i < salesForMonth.length; i++) {
            total += (double) salesForMonth[i];
        }
        return "Average sales for Month " + month + "\t: " + Helper.formatTwoDecimals(total / salesForMonth.length);
    }

    // part 3.2 overload for weekly sales with period
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
    public static String sortPrices(Double[] array) {
        Arrays.sort(array);
        String result = java.util.Arrays.toString(array);
        return result;
    }

    // part 4.2 nested for-each loops to display the elements of the "matrix" array
    // in grid format
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