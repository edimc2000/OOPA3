package OOPA3;

/**
 * The ProductManager class serves as the main controller and demonstration class
 * for managing product information and sales data.
 * 
 * This class demonstrates various functionalities including:
 * 
 *  Product creation and initialization
 *  Sales data management (weekly and monthly)
 *  Average sales calculations
 *  Price sorting operations
 *  Matrix data display
 * 
 * The main method showcases the complete functionality of the Product class
 * through a comprehensive demonstration with sample data.
 * 
 * Author: Eddie
 * Date: 2025-Oct-24
 */

import static java.lang.System.*;

public class ProductManager {

  // part 1.3
  public static void main(String[] args) {

    // part 1.3 Array to hold 10 Product objects for demonstration
    Product[] product = new Product[10];

    // Array of product names for initializing product objects
    String[] productNamesArray = {
        "Queen Size Mattress", "Leather Sofa", "Dining Table Set",
        "Office Chair", "Bookshelf", "Coffee Table", "Wardrobe",
        "Bed Frame", "TV Stand", "Bar Stool"
    };

    // Array of product IDs corresponding to the product names
    int[] productIDsArray = { 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010 };

    /**
     * 2D array containing price tiers for each product
     * Each inner array represents different price points for variations of the same
     * product
     * (e.g., different sizes, materials, or feature levels)
     */
    Double[][] productPricesArray = {
        { 499.99, 599.99, 699.99 }, // Queen Size Mattress - different firmness levels
        { 1099.99, 899.99, 1299.99 }, // Leather Sofa - different leather grades
        { 449.99, 549.99, 649.99 }, // Dining Table Set - 4,6,8 chairs included
        { 129.99, 179.99, 229.99 }, // Office Chair - basic, mid, premium
        { 199.99, 249.99, 299.99 }, // Bookshelf - small, medium, large
        { 159.99, 199.99, 239.99 }, // Coffee Table - different materials
        { 399.99, 499.99, 599.99 }, // Wardrobe - different sizes
        { 299.99, 399.99, 499.99 }, // Bed Frame - twin, queen, king
        { 179.99, 229.99, 279.99 }, // TV Stand - different styles
        { 79.99, 99.99, 119.99 } // Bar Stool - basic, padded, premium
    };

    // part 4.1 Create a two-dimensional integer array named "matrix" representing a
    // 5x5 matrix with random values.
    /**
     * Sample 5x5 matrix for demonstrating matrix display functionality
     * Contains predefined integer values in a grid pattern
     */
    int[][] matrixSample = {
        { 601, 602, 603, 604, 605 },
        { 701, 702, 703, 704, 705 },
        { 401, 402, 403, 404, 405 },
        { 101, 102, 103, 104, 105 },
        { 501, 502, 503, 504, 505 },
    };

    // part 1.6 Sales for a quarter (3 months)
    /**
     * Quarterly sales data representing 12 weeks of sales (3 months × 4 weeks)
     * Used to initialize the weekly sales data in the Product class
     */
    int[] oneQuarterSales = {
        29802, 31567, 28451, 30289,
        29123, 30876, 29745, 31234,
        28679, 30555, 29321, 30987
    };

    // part 1.3 creating products based on the sample declared arrays above
    /**
     * Creates Product objects by iterating through the initialization arrays
     * and combining name, ID, and price data for each product
     */
    for (int i = 0; i < productIDsArray.length; i++) {
      product[i] = new Product(productNamesArray[i], productIDsArray[i],
          productPricesArray[i]);
    }

    // part 1.4 displays all product information in a formatted output
    out.println(Product.displayProductInfo(product));

    // part 1.6 initialize the "weeklySales" array with random integer values
    // representing weekly sales for a quarter (four weeks).
    Product.setWeeklySales(oneQuarterSales);

    // part 1.7 displays formatted weekly sales information
    out.println(Product.showWeeklySales());

    // part 2.1 Processes weekly sales data into monthly groupings and displays the
    // results
    Product.setMonthlySales();
    // part 2.2 and display monthlySales
    out.println(Product.showMonthlySales());

    /**
     * Demonstrates average sales calculations using different method overloads
     * Shows both direct array passing and month-specific calculations
     */
    // part 3.1 findAverageSales that takes an integer array as a parameter
    out.println("\nAverage sales for Month 1\t: " + Product.findAverageSales(Product.getMonthlySales()[0]));

    // part 3.1 improvement overload, with additional params for the month
    // out.println("\n" + Product.findAverageSales(Product.getMonthlySales(), 1));
    // out.println("\n" + Product.findAverageSales(Product.getMonthlySales(), 2));
    out.println("\n" + Product.findAverageSales(Product.getMonthlySales(), 3));

    // part 3.2 weekly sales
    /**
     * Calculates average sales for specific weekly periods within the quarter
     */
    // out.println("\n" + Product.findAverageSales(Product.getWeeklySales(), 1, 4));
    // out.println("\n" + Product.findAverageSales(Product.getWeeklySales(), 5, 8));
    out.println("\n" + Product.findAverageSales(Product.getWeeklySales(), 9, 12));

    // part 3.4
    /**
     * Demonstrates price sorting functionality using sample price data
     */
    Double[] sampleData = product[1].getPrices();
    out.println("\nSorted Prices \t: " + Product.sortPrices(sampleData));

    /**
     * Demonstrates matrix display functionality using both direct array
     * and getter/setter approaches
     */
    // part 4.2 display matrix array in grid format
    out.println(Product.displayMatrix(matrixSample));

    // part 4.2 display matrix array in grid format using setters and getters
    Product.setMatrix(matrixSample);
    out.println(Product.displayMatrix(Product.getMatrix()));

  }

}
