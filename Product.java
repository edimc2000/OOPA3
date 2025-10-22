package OOPA3;

import static java.lang.System.out;

// import static java.lang.System.*;

public class Product {

    private String productName;
    private int productID;
    private Double[] prices;

    private static int[] weeklySales = new int[40];

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public Double[] getPrices() {
        return prices;
    }

    public static String showWeeklySales() {
        String result = "Weekly Sales \n";
        for (int i = 0; i < weeklySales.length; i++) {
            result += " Week " + String.valueOf(i + 1) + "\t: " + weeklySales[i] + "\n";
        }

        return result;
    }

    Product(String productName, int productID, Double[] prices) {
        this.productName = productName;
        this.productID = productID;
        this.prices = prices;

        // Sales for a quarter
        int[] oneQuarterSales = { 29802, 31567, 28451, 30289, 29123, 30876, 29745,
                31234, 28679, 30555, 29321, 30987, 30123 };

        // initializing weeklySales
        for (int i = 0; i < oneQuarterSales.length; i++) {
            weeklySales[i] = oneQuarterSales[i];
        }

    }

    // @Override
    public String displayProductInfo(int i) {
        return "Product " + (i + 1) +
                " --------------------------------------------" +
                "\n Product Name\t: " + productName +
                "\n Product ID\t: " + productID +
                "\n Prices\t\t: " + java.util.Arrays.toString(prices);
    }
}
