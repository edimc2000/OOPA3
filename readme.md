# Product Sales and Inventory Management

This Java project demonstrates a simple inventory and sales data management system using object-oriented programming. It models products with multiple prices, tracks weekly and monthly sales, and handles two-dimensional arrays for sales data and matrix display.

## Overview
- **Product.java**: Defines the `Product` class representing a product with attributes like name, ID, and an array of prices. It manages weekly and monthly sales data, provides methods to calculate average sales, sort prices, and display two-dimensional matrices.
- **ProductManager.java**: Contains the main method to create sample products, initialize sales data, and demonstrate various product data operations including sales display, average calculations, sorting, and matrix printing.

## Features
- Product creation with name, ID, and multiple price points.
- Weekly sales data stored in a static array with a capacity of 40 weeks.
- Monthly sales extracted from weekly sales as 3 months with 4 weeks each.
- Methods to calculate average sales over a given period or month.
- Price sorting for product price arrays.
- Display functions for products, sales data, and 2D matrix arrays.
- Matrix handling with setters and getters for a 5x5 integer matrix.

## Class Details

### Product

- Fields:
  - `productName` (String)
  - `productID` (int)
  - `prices` (Double[])
  - `weeklySales` (static int[])
  - `monthlySales` (static int[][])
  - `matrix` (static int[][])

- Key Methods:
  - Constructor to initialize product details.
  - `displayProductInfo(Product[])`: Returns formatted string info for multiple products.
  - `setWeeklySales(int[])`: Copies and stores weekly sales data.
  - `setMonthlySales()`: Extracts monthly sales from weekly sales.
  - `showWeeklySales()`, `showMonthlySales()`: Display sales data.
  - Overloaded `findAverageSales()` methods to calculate averages.
  - `sortPrices(Double[])`: Sorts an array of prices.
  - `displayMatrix(int[][])`: Formats a 2D matrix as a string.

### ProductManager

- Main class that:
  - Defines sample product names, IDs, prices, sales, and matrix data.
  - Instantiates an array of `Product` objects.
  - Prints product details and sales data.
  - Demonstrates sales average calculation and price sorting.
  - Displays a 5x5 integer matrix.

## Usage

To run the project:

1. Compile both classes:
   ```bash
   javac OOPA3/Product.java OOPA3/ProductManager.java
   ```
2. Run the main program:
   ```bash
   java OOPA3.ProductManager
   ```

This will output detailed product info, weekly and monthly sales reports, average sales calculations, sorted price lists, and matrix displays.

## Notes

- The project assumes a fixed size for weekly sales (40 weeks) and monthly sales arranged as 3 months with 4 weeks each.
- Helper methods (like `Helper.formatTwoDecimals()`) are used for formatting numbers and should be defined elsewhere in the package.
- The matrix is initialized manually in `ProductManager` and can be manipulated through the `Product` class setters/getters.

## Questions
For questions, contact Eddie or refer to course T0502 materials.
