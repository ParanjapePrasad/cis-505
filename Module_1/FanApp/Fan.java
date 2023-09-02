/*
 * Liang, Y.D. (2019).  Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.).  Pearson Education, Inc.
 * Payne, D. (2021).  CSD 405 Intermediate Java Programming.  Bellevue University, all rights reserved.
 * Paranjape, Prasad. (2023).  CIS 505 Intermediate Java Programming. Bellevue University.
 */

package Module_1.FanApp;

public class Fan {

    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Class default Constructor
     */
    Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    } // end Fan default Constructor

    /**
     * Class argument constructor
     * 
     * @param speed
     * @param on
     * @param radius
     * @param color
     */
    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    } // end fan argument Constructor

    /**
     * Accessor method to get the speed of the fan
     * 
     * @return Speed of the fan
     */
    public int getSpeed() {
        return speed;
    } // end getSpeed

    /**
     * Mutator method to set the fan speed
     * 
     * @param speed of the fan to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    } // end setSpeed

    /**
     * Accessor method to get the functioning of the fan
     * 
     * @return the fan is functioning or not
     */
    public boolean isOn() {
        return on;
    } // end isOn

    /**
     * Mutator method to set the functioning of the fan
     * 
     * @param to turn on or off the functioning of the fan
     */
    public void setOn(boolean on) {
        this.on = on;
    } // end SetOn

    /**
     * Accessor method to get the radios of the fan
     * 
     * @return the radios of the fan
     */
    public double getRadius() {
        return radius;
    } // end getRadius

    /**
     * Mutator method to set the radios of the fan
     * 
     * @param radius of the fan to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    } // end setRadius

    /**
     * Accessor method to get the color of the fan
     * 
     * @return the color of the fan
     */
    public String getColor() {
        return color;
    } // end getColor

    /**
     * Mutator method to set the color of the fan
     * 
     * @param color of the fan
     */
    public void setColor(String color) {
        this.color = color;
    } // end SetColor

    /**
     * @return Return a string description for the fan.
     */
    public String toString() {
        if (on == true) {
            return "The fan speed is set to " + getSpeed() + " with a color of " + getColor() + " and a radius of "
                    + getRadius();

        } else {
            return "The fan is " + getColor() + " with a radius of " + getRadius() + " and the fan is off";
        }
    } // end toString

} // end Fan
