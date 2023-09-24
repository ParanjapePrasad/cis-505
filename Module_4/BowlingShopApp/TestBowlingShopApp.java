/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    TestBowlingShopApp.java class to test the Product, Ball, Bag, Shoe, ProductDB, and GenericQueue classes.
 */

package Module_4.BowlingShopApp;

import java.util.Scanner;

public class TestBowlingShopApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object to handle user prompts
        System.out.println("\nWelcome to the Bowling Shop\n\n"); // Welcome message
        String option = " ";
        GenericQueue<Product> products;
        while (true) {
            displayMenu(); // Show menu options and prompt the user to enter from the menu option
            option = scanner.nextLine();
            if (option.equalsIgnoreCase("x")) {
                break; // Break while loop when user do not want to proceed
            } else {
                products = ProductDB.getProducts(option); // Generate product summary depending on the user input
                System.out.println("\n--Product Listing--");
                while (products.size() > 0) {
                    System.out.println(products.dequeue().toString() + "\n"); // Print the product summary to console                                                                              
                }
            }
        }
        scanner.close();
        System.out.println("\n  End of line...");
    } // end main

    /**
     * displayMenu method to print menu options to console
     */
    public static void displayMenu() {

        System.out.print("""
                MENU OPTIONS
                  1. <b> Bowling Balls
                  2. <a> Bowling Bags
                  3. <s> Bowling Shoes
                  4. <x> To exit

                Please choose an option:\s""");
    } // end displayMenu

} // end TestBowlingShopApp