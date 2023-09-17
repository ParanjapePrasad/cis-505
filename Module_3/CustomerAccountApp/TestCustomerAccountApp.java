/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023   
    
    Prasad Paranjape, CIS 505  September, 2023
    TestCustomerAccountApp.java class to test the Account, Customer, and CustomerDB classes
 */

package Module_3.CustomerAccountApp;

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object to handle user prompts
        System.out.println("\n  Welcome to the Customer Account App"); // Welcome message
        System.out.print("  Enter a customer ID: \n    ex: 1007, 1008, 1009>: "); // Prompt the user to enter the customer
                                                                              // id
        String customerId = scanner.nextLine();
        Customer customer = CustomerDB.getCustomer(Integer.parseInt(customerId));
        Account account = new Account();

        while (true) {
            account.displayMenu(); // Display account menu
            System.out.print("    Enter option>: ");          

            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("d")) { // deposit the amount option
                System.out.print("\n  Enter deposit amount: ");
                String amount = scanner.nextLine();
                account.deposit(Double.parseDouble(amount));
            } else if (option.equalsIgnoreCase("w")) { // Withdraw amount from the account option
                System.out.print("\n  Enter withdraw amount: ");
                String amount = scanner.nextLine();
                account.withdraw(Double.parseDouble(amount));
            } else if (option.equalsIgnoreCase("b")) { // Check balance
                System.out.printf("\n  Account balance: $%,6.2f", account.getBalance());
            } else { // Prompt the user a message for an invalid option
                System.out.println("\n  Error: Invalid option");
            }

            System.out.print("\n  Continue? (y/n): ");// Prompting user to decide between continuing or exiting the
                                                    // program

            String proceed = scanner.nextLine();
            if (proceed.equalsIgnoreCase("n")) {
                break; // Break do-while loop when user do not want to proceed
            }
        }

        System.out.println(customer.toString()); // Print the customer summary to console window
        System.out.printf("\n  Balance as of %s is $%,6.2f\n", account.getTransactionDate(), account.getBalance());
        
        scanner.close();
        System.out.println("\n  End of line...\n");

    }// end main

} // end TestCustomerAccountApp