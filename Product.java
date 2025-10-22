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

        // part 2.1
        for (int i = 0; i < 3; i++) {
            int start = i * 4;
            int end = start + 4;
            monthlySales[i] = Arrays.copyOfRange(weeklySales, start, end);
        }

    }

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
                    Helper.formatTwoDecimals(weeklySales[i]) +
                    "\n";
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
       out.println("DEBUG300 " + java.util.Arrays.toString(array));
        Double total = 0.00;
        for (int i = 0; i < array.length; i++) {
          //  out.println(" i = " + array[i]);
            total += (double) array[i];
           // out.println(" running total = " + total);
        }
        return Helper.formatTwoDecimals(total / array.length);
    }
    // part 3.1 overload 
    public static String findAverageSales(int[] array, int month) {
       // out.println("DEBUG300 " + java.util.Arrays.toString(array));
        Double total = 0.00;
        for (int i = 0; i < array.length; i++) {
           // out.println(" i = " + array[i]);
            total += (double) array[i];
           // out.println(" running total = " + total);
        }
        return "Average sales for Month 1\t: " + Helper.formatTwoDecimals(total / array.length);
    }


        // part 3.2 overload for weekly sales with period --- to be continued 
    public static String findAverageSales(int[] array, int weekStart, int weekEnd ) {
       // out.println("DEBUG300 " + java.util.Arrays.toString(array));
        Double total = 0.00;
        for (int i = 0; i < array.length; i++) {
           // out.println(" i = " + array[i]);
            total += (double) array[i];
           // out.println(" running total = " + total);
        }
        return "Average sales for Month 1\t: " + Helper.formatTwoDecimals(total / array.length); //change this display
    }

}