/*
 * Liang, Y.D. (2019).  Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.).  Pearson Education, Inc.
 * Payne, D. (2021).  CSD 405 Intermediate Java Programming.  Bellevue University, all rights reserved.
 * Paranjape, Prasad. (2023).  CIS 505 Intermediate Java Programming. Bellevue University.
 */

package Module_1.HelloWorldApp;

public class ParanjapeHelloWorld {

    /*
     * Method with two arguments which prints the Hello World with first name and
     * last name
     *
     * @param firstName String
     *
     * @param lastName String
     *
     */
    public static void hello(String firstName, String lastname) {
        System.out.printf(String.format("Hello World from %s %s", firstName, lastname));
    } // end hello

    public static void main(String[] args) {
        hello("Prasad", "Paranjape");
    } // end main

} // end ParanjapeHelloWorld