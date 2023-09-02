/*
 * Liang, Y.D. (2019).  Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.).  Pearson Education, Inc.
 * Payne, D. (2021).  CSD 405 Intermediate Java Programming.  Bellevue University, all rights reserved.
 * Paranjape, Prasad. (2023).  CIS 505 Intermediate Java Programming. Bellevue University.
 */

package Module_1.FanApp;

public class TestFanApp {

    public static void main(String[] args) {

        Fan fan1 = new Fan(); // Fan class with default constructor
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8, "Blue"); // Fan class with argument constructor with fan attributes

        System.out.println(fan1.toString()); // Call overridden method to print fan attributes
        System.out.println(fan2.toString()); // Call overridden method to print fan attributes

    } // end main

} // end TestFanApp
