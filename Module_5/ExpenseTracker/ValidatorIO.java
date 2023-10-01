/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    ValidatorIO.java class to to validate invalid user entries
 */

package Module_5.ExpenseTracker;

import java.util.Scanner;

public class ValidatorIO {

    /**
     * Method to validate and return a user/file Integer input value
     * 
     * @param sc     Scanner
     * @param prompt String
     * @return Integer
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n  Error! Invalid integer value.");
            }
            sc.nextLine();
        }
        return input;
    } // end getInt

    /**
     * Method to validate and return a user/file Double value
     * 
     * @param sc     Scanner
     * @param prompt String
     * @return Double
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n  Error! Invalid double value.");
            }
            sc.nextLine();
        }
        return input;
    } // end getDouble

    /**
     * getSTring method to return a user/file String value
     * 
     * @param sc     Scanner
     * @param prompt String
     * @return String from input
     */
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.next();
        sc.nextLine();
        return input;
    } // end getString

} // end ValidatorIO