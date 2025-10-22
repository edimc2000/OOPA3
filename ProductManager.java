package OOPA3;

import static java.lang.System.*;

public class ProductManager {

  // part 1.3
  public static void main(String[] args) {

    Product[] items = new Product[10]; // part 1.3 

    String[] productNamesArray = {
        "Queen Size Mattress", "Leather Sofa", "Dining Table Set",
        "Office Chair", "Bookshelf", "Coffee Table", "Wardrobe",
        "Bed Frame", "TV Stand", "Bar Stool"
    };

    int[] productIDsArray = { 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010 };

    Double[][] productPricesArray = {
        { 499.99, 599.99, 699.99 }, // Queen Size Mattress - different firmness levels
        { 899.99, 1099.99, 1299.99 }, // Leather Sofa - different leather grades
        { 449.99, 549.99, 649.99 }, // Dining Table Set - 4,6,8 chairs included
        { 129.99, 179.99, 229.99 }, // Office Chair - basic, mid, premium
        { 199.99, 249.99, 299.99 }, // Bookshelf - small, medium, large
        { 159.99, 199.99, 239.99 }, // Coffee Table - different materials
        { 399.99, 499.99, 599.99 }, // Wardrobe - different sizes
        { 299.99, 399.99, 499.99 }, // Bed Frame - twin, queen, king
        { 179.99, 229.99, 279.99 }, // TV Stand - different styles
        { 79.99, 99.99, 119.99 } // Bar Stool - basic, padded, premium
    };

    for (int i = 0; i < productIDsArray.length; i++) {
      // part 1.3 creating products based on the sample declared arrays above
      items[i] = new Product(productNamesArray[i], productIDsArray[i], productPricesArray[i]);
      // part 1.4 showing product information
      out.println(items[i].displayProductInfo(i));
    }

    out.println(Product.showWeeklySales());

  }

}
