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
    // private static int[][] monthlySales;

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

    // part 1.2 implementing a constructor
    Product(String productName, int productID, Double[] prices) {
        this.productName = productName;
        this.productID = productID;
        this.prices = prices;
    }

    // part 1.4
    public static String displayProductInfo(Product[] array) {
        String result = "";
        int counter = 1;
        for (Product product : array) {
            result += "Product " + counter++ +
                    "\n--------------------------------------------" +
                    "\n Product Name\t: " + product.productName +
                    "\n Product ID\t: " + product.productID +
                    "\n Prices\t\t: " + java.util.Arrays.toString(product.prices) +
                    "\n";
        }
        return result;
    }

    // part 1.7
    public static String showWeeklySales() {
        String result = "Weekly Sales:" +
                "\n--------------------------------------------";
        int counter = 1;
        for (int element : getWeeklySales()) {
            result += "\nWeek " + (counter <= 9 ? "0" : "") + counter + " \t: $" + Helper.formatTwoDecimals(element);
            counter++;
        }
        return result;
    }

    public static String showMonthlySales() {
        // return monthlySales;
        // out.println(java.util.Arrays.toString(monthlySales[0]));
        String result = "Monthly Sales --------------------\n";
        int monthCount = 1;
        for (int[] element : monthlySales) {
            result += " Month " + monthCount + "\t: " + java.util.Arrays.toString(element) + "\n";
            monthCount += 1;
            // out.println(java.util.Arrays.toString(element));
        }
        return result;
    }

    // part 3.1
    public static String findAverageSales(int[] array) {
        out.println("DEBUG300 ***  " + java.util.Arrays.toString(array));
        Double total = 0.00;
        for (int i = 0; i < array.length; i++) {
            // out.println(" i = " + array[i]);
            total += (double) array[i];
            // out.println(" running total = " + total);
        }
        return Helper.formatTwoDecimals(total / array.length);
    }

    // part 3.1 overload
    public static String findAverageSales(int[][] array, int month) {
        out.println("DEBUG300 ***  " + java.util.Arrays.toString(array[month - 1]));
        int[] salesForMonth = array[month - 1];
        Double total = 0.00;
        for (int i = 0; i < salesForMonth.length; i++) {
            // out.println(" i = " + array[i]);
            total += (double) salesForMonth[i];
            out.println(" running total = " + total);
        }
        return "Average sales for Month *** " + month + "\t: " + Helper.formatTwoDecimals(total / salesForMonth.length);
    }

    // part 3.2 overload for weekly sales with period --- to be continued
    public static String findAverageSales(int[] array, int weekStart, int weekEnd) {
        // out.println("DEBUG1000" + " start " + weekStart+ " end " + weekEnd);
        out.println("DEBUG300 " + java.util.Arrays.toString(array));
        Double total = 0.00;
        out.println("array length \t: " + (weekEnd - weekStart + 1));
        // out.println("array start \t: " + (weekEnd - weekStart + 1));
        // out.println("array end \t: " + (weekEnd - weekStart + 1));

        for (int i = (weekStart - 1); i < (weekEnd); i++) {
            out.println("*** DEBUG1000 loop *** WEEK #  " + (i + 1) + "\t: " + array[i]);
            total += array[i];

        }
        String result = "Average sales from  week " + weekStart + " to week  " + weekEnd + "\t: " +
                Helper.formatTwoDecimals(total / (weekEnd - weekStart + 1));
        return result;
    }

    // part 3.3
    public static String sortPrices(Double[] array) {
        out.println("DEBUG300 " + java.util.Arrays.toString(array));
        Arrays.sort(array);
        String result = java.util.Arrays.toString(array);
        return result;
    }

    // part 4.2
    public static String displayMatrix(int[][] array) {
        String result = "";
        for (int[] rowElement : array) {
            for (int element : rowElement) {
                result += element + " ";
            }
            result += "\n";
        }
        return result;
    }

}