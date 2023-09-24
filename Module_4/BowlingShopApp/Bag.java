/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    Ball.java class to represent a bowling bag.
 */

package Module_4.BowlingShopApp;

public class Bag extends Product {
    private String type;

    /**
     * Default class constructor
     */
    public Bag() {
        super();
        this.type = "";
    }

    /**
     * An accessor method to get type data field
     *
     * @return String, return the type data field
     */
    public String getType() {
        return type;
    } 

    /**
     * Mutator method to set the type data field
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    } 

    /**
     * Overriding toString method
     *
     * @return String, Return an appended string of the superclass with an
     *         additional field for the bags type.
     */
    public String toString() {
        return super.toString() + "\nType: " + type;
    } 

} // end Bag