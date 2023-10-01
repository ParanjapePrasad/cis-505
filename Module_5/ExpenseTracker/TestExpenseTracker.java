/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    TestExpenseTracker.java class to test the classes Transaction, TransactionIO, and ValidatorIO
 */

package Module_5.ExpenseTracker;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class TestExpenseTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object to handle user prompts
        System.out.println("  Welcome to the Expense Tracker\n"); // Welcome message

        do {
            int input = ValidatorIO.getInt(scanner, menu()); // Display transaction menu

            if (input == 1) { // user selects menu item one, display all the transactions in the expenses.txt
                              // file
                try {
                    System.out.println("\n  MONTHLY EXPENSES");
                    ArrayList<Transaction> transactions = TransactionIO.findAll();

                    for (Transaction tran : transactions) {
                        System.out.printf("\n  Date: %s\n  Description: %s\n  Amount: $%6.2f\n", tran.getDate(),
                                tran.getDescription(), tran.getAmount());
                    }
                } catch (IOException e) {
                    System.out.println("\n Exception: " + e.getMessage());
                }
            } else if (input == 2) { // user selects menu item two, allow the user to add a new transaction to the
                                     // expenses.txt
                ArrayList<Transaction> transactions = new ArrayList<Transaction>();
                do {
                    String description = ValidatorIO.getString(scanner, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(scanner, "  Enter the amount: ");

                    Transaction transaction = new Transaction();
                    transaction.setDescription(description);
                    transaction.setAmount(amount);

                    transactions.add(transaction);
                } while (ValidatorIO.getString(scanner, "\n  Add another transaction? (y/n): ").equalsIgnoreCase("y"));

                try {
                    TransactionIO.bulkInsert(transactions);
                } catch (IOException e) {
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            } else if (input == 3) { // user selects menu item three, display the total expenses of all transactions
                                     // in the expenses.txt file
                try {
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    double monthlyExpense = 0.0;

                    for (Transaction transaction : transactions) {
                        monthlyExpense += transaction.getAmount();
                    }

                    System.out.printf("\n  Your total monthly expense is $%6.2f\n", monthlyExpense);

                } catch (IOException e) {
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            } else { // User selects invalid menu
                System.out.println("  Invalid input");
            }
            if (ValidatorIO.getString(scanner, "\n  Continue? (y/n): ").equalsIgnoreCase("n")) {
                break;
            }

        } while (true);
        scanner.close();
        System.out.println("\n  Program terminated by the user...");

    } // end main

    public static String menu() {
        return "  MENU OPTIONS\n" +
                "    1. View Transactions\n" +
                "    2. Add Transactions\n" +
                "    3. View Expense\n" +
                "\n" +
                "  Please choose an option: ";
    } // end menu

} // end TestExpenseTracker