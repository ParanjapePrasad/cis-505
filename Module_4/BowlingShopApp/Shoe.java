/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    Shoe.java class to represent bowling shoes
 */

package Module_4.BowlingShopApp;

public class Shoe extends Product {
    private double size;

    /**
     * Default class constructor
     */
    public Shoe() {
        super();
        this.size = 0.0;
    }

    /**
     * An accessor method to get size data field
     *
     * @return double, return the size data field
     */
    public double getSize() {
        return size;
    }

    /**
     * Mutator method to set the size data field
     *
     * @param size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Overriding toString method
     *
     * @return String, Return an appended string of the superclass with an
     *         additional field for the shoe type.
     */
    public String toString() {
        return super.toString() + "\nSize: " + String.valueOf(size);
    } // end toString

} // end Shoe