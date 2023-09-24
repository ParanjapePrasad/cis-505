/*
   Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
     Comprehensive Version (12th ed.). Pearson Education, Inc. 
   Modified by P. Prasad 2023

   Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

   Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
   Modified by P. Prasad 2023

   Prasad Paranjape, CIS 505  September 2023
   Product.java class to represent a product in a bowling shop
*/

package Module_4.BowlingShopApp;

public class Product {
    private String code;
    private String description;
    private double price;

    /**
     * Default class constructor
     */
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0.0;
    }

    /**
     * Accessor method to get Product's code
     *
     * @return String, returns the code data field
     */
    public String getCode() {
        return code;
    }

    /**
     * Mutator method to set the description code field
     *
     * @param code, product code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Accessor method to get Product's description
     *
     * @return String, returns the description data field
     */
    public String getDescription() {
        return description;
    }

    /**
     * Mutator method to set the description data field
     *
     * @param description, product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Accessor method to get Product's price
     *
     * @return double, returns the code price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mutator method to set the price data field
     *
     * @param price, product price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Overriding toString method
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Product Code: " + code + "\nDescription: " + description + "\nPrice: $ " + price;
    } // end toString

} // end Product