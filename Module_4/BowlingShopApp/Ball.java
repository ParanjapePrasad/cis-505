/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    
    Ball.java class to represent a bowling ball.
 */

package Module_4.BowlingShopApp;

public class Ball extends Product {
    private String color;

    /**
     * Default class constructor
     */
    public Ball() {
        super();
        this.color = "";
    }

    /**
     * An accessor method to get color data field
     *
     * @return String, return the color data field
     */
    public String getColor() {
        return color;
    }

    /**
     * Mutator method to set the color data field
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Overriding toString method
     *
     * @return String, Return an appended string of the superclass with an
     *         additional field for the bowling balls color
     */
    public String toString() {
        return super.toString() + "\nColor: " + color;
    } // end toString

} // end Ball