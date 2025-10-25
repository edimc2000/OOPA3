This readme.md file has been generated with assistance from Perplexity AI. 

# Product Management System

A Java-based product management system that demonstrates object-oriented programming concepts including product management, sales tracking, and data analysis.

## Project Overview

This project consists of three main classes that work together to manage product information and analyze sales data:

- **Product.java** - Core class managing product data and sales operations
- **Helper.java** - Utility class providing formatting functions
- **ProductManager.java** - Main controller demonstrating system functionality

## Features

### Product Management
- Create and manage product objects with names, IDs, and multiple price tiers
- Display comprehensive product information in formatted output
- Support for multiple pricing options per product

### Sales Data Management
- **Weekly Sales Tracking** - Track sales data for up to 40 weeks
- **Monthly Sales Analysis** - Organize weekly data into monthly periods (4 weeks per month)
- **Quarterly Reports** - Generate quarterly sales summaries

### Data Analysis
- Calculate average sales for:
  - Individual months
  - Specific week ranges
  - Complete sales periods
- Sort product prices in ascending order
- Display sales data in various formatted views

### Matrix Operations
- Store and display 5x5 matrix data
- Grid-formatted output for two-dimensional arrays

## Class Structure

### Product.java

**Instance Variables:**
- `productName` (String) - The name of the product
- `productID` (int) - Unique identifier for the product
- `prices` (Double[]) - Array of price tiers for the product

**Static Variables:**
- `weeklySales` (int[]) - Array storing 40 weeks of sales data
- `monthlySales` (int[][]) - 2D array storing 3 months × 4 weeks of data
- `matrix` (int[][]) - 5×5 matrix for general data storage

**Key Methods:**

| Method | Parameters | Return Type | Description |
|--------|-----------|-------------|-------------|
| `displayProductInfo()` | Product[] | String | Displays all product information |
| `showWeeklySales()` | - | String | Formats and displays weekly sales |
| `showMonthlySales()` | - | String | Formats and displays monthly sales |
| `findAverageSales()` | int[] | String | Calculates average from array |
| `findAverageSales()` | int[][], int | String | Calculates average for specific month |
| `findAverageSales()` | int[], int, int | String | Calculates average for week range |
| `sortPrices()` | Double[] | String | Sorts prices in ascending order |
| `displayMatrix()` | int[][] | String | Displays 2D array in grid format |

### Helper.java

**Utility Methods:**

| Method | Parameters | Return Type | Description |
|--------|-----------|-------------|-------------|
| `formatTwoDecimals()` | double | String | Formats numbers to 2 decimal places with grouping separators |
| `formatWeekNumber()` | int | String | Adds leading zero for single-digit week numbers |

**Examples:**
```java
formatTwoDecimals(1234.56789);  // Returns "1,234.56"
formatWeekNumber(5);             // Returns "05"
formatWeekNumber(12);            // Returns "12"
```

### ProductManager.java

The main driver class that demonstrates all system functionality:

1. **Product Initialization** - Creates 10 sample products with furniture items
2. **Sales Data Setup** - Initializes quarterly sales data (12 weeks)
3. **Data Display** - Shows formatted product and sales information
4. **Analysis Demonstrations** - Calculates various averages and sorts data
5. **Matrix Operations** - Demonstrates 2D array display capabilities

## Sample Data

### Products
The system includes 10 furniture products:
- Queen Size Mattress (ID: 2001)
- Leather Sofa (ID: 2002)
- Dining Table Set (ID: 2003)
- Office Chair (ID: 2004)
- Bookshelf (ID: 2005)
- Coffee Table (ID: 2006)
- Wardrobe (ID: 2007)
- Bed Frame (ID: 2008)
- TV Stand (ID: 2009)
- Bar Stool (ID: 2010)

Each product has 3 price tiers representing different variations.

### Sales Data
Quarterly sales data spanning 12 weeks (3 months):
```
Week 01: $29,802    Week 05: $29,123    Week 09: $28,679
Week 02: $31,567    Week 06: $30,876    Week 10: $30,555
Week 03: $28,451    Week 07: $29,745    Week 11: $29,321
Week 04: $30,289    Week 08: $31,234    Week 12: $30,987
```

## How to Run

1. **Compile the Java files:**
   ```bash
   javac OOPA3/Helper.java
   javac OOPA3/Product.java
   javac OOPA3/ProductManager.java
   ```

2. **Run the main program:**
   ```bash
   java OOPA3.ProductManager
   ```

## Output Examples

### Product Information Display
```
Product 1
--------------------------------------------
 Product Name   : Queen Size Mattress
 Product ID     : 2001
 Prices         : [499.99, 599.99, 699.99]
```

### Weekly Sales Display
```
Weekly  Sales: 
--------------------------------------------
 Week 01    : $ 29,802.00
 Week 02    : $ 31,567.00
 ...
```

### Average Sales Calculations
```
Average sales for Month 1       : 30,027.25
Average sales from week 1 to week 4     : 30,027.25
Average sales from week 5 to week 8     : 30,244.50
Average sales from week 9 to week 12    : 29,885.50
```

### Matrix Display
```
Two-Dimensional Array:
--------------------------------------------
601 602 603 604 605 
701 702 703 704 705 
401 402 403 404 405 
101 102 103 104 105 
501 502 503 504 505 
```

## Key Programming Concepts Demonstrated

### Object-Oriented Programming
- **Encapsulation** - Private instance variables with public getters/setters
- **Constructor Usage** - Parameterized constructor for Product initialization
- **Static Methods** - Shared functionality across all instances

### Arrays and Collections
- **Single-Dimensional Arrays** - Weekly sales tracking
- **Two-Dimensional Arrays** - Monthly sales and matrix operations
- **Array Manipulation** - Copying, sorting, and range operations

### Method Overloading
The `findAverageSales()` method demonstrates polymorphism:
```java
findAverageSales(int[] array)                    // Basic average
findAverageSales(int[][] array, int month)       // Monthly average
findAverageSales(int[] array, int start, int end) // Range average
```

### Data Formatting
- Decimal formatting with thousands separators
- Week number padding for consistent display
- Grid-based matrix visualization

## Package Structure
```
OOPA3/
├── Helper.java          - Utility formatting methods
├── Product.java         - Core product and sales management
└── ProductManager.java  - Main application controller
```

## Requirements

- **Java Version:** Java 8 or higher
- **Dependencies:** None (uses only Java standard library)

## Technical Notes

### Data Structures
- All sales data is stored in static arrays for shared access
- Product information is stored in instance variables for per-object data
- Matrix operations use 2D arrays for grid-based data

### Memory Efficiency
- Weekly sales array has fixed capacity of 40 elements
- Monthly sales uses efficient array partitioning (copyOfRange)
- String operations use StringBuilder for optimal performance

### Error Handling
The Helper class includes validation:
- `formatTwoDecimals()` throws IllegalArgumentException for NaN/infinite values
- `formatWeekNumber()` throws IllegalArgumentException for invalid week numbers

## Future Enhancements

Potential improvements for the system:
- Add database integration for persistent storage
- Implement product search and filtering
- Add graphical sales charts and visualizations
- Include inventory tracking functionality
- Support for custom date ranges in sales analysis
- Export sales reports to CSV/PDF formats

## Author

**Eddie**  
Date: October 24, 2025

---

## Quick Reference: Method Signatures

```java
// Product.java
public static String displayProductInfo(Product[] array)
public static String showWeeklySales()
public static String showMonthlySales()
public static String findAverageSales(int[] array)
public static String findAverageSales(int[][] array, int month)
public static String findAverageSales(int[] array, int weekStart, int weekEnd)
public static String sortPrices(Double[] array)
public static String displayMatrix(int[][] array)

// Helper.java
public static String formatTwoDecimals(double decimal)
public static String formatWeekNumber(int weekNumber)
```

## Contact

For questions or issues regarding this project, please refer to the course materials or contact the instructor.
