/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    Transaction.java class to represent an expense transaction.
 */

package Module_5.ExpenseTracker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {

    private String date;
    private String description;
    private double amount;

    /**
     * Default class constructor
     */
    public Transaction() {
        date = String.valueOf(new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime()));
        description = "";
        amount = 0.0;
    }

    /**
     * Class argument constructor
     * 
     * @param date        String
     * @param description String
     * @param amount      double
     */
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    /**
     * An accessor method to get date data field
     *
     * @return String, return the date data field
     */
    public String getDate() {
        return date;
    }

    /**
     * Mutator method to set the date data field
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * An accessor method to get description data field
     *
     * @return String, return the description data field
     */
    public String getDescription() {
        return description;
    }

    /**
     * Mutator method to set the description data field
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An accessor method to get amount data field
     *
     * @return String, return the amount data field
     */
    public double getAmount() {
        return amount;
    } // end getAmount

    /**
     * Mutator method to set the amount data field
     *
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Overriding toString method
     * 
     * @return String, description of a transaction with all three data fields, on
     *         separate lines.
     */
    public String toString() {
        return "  Date: " + date + "\n  Description: " + description + "\n  Amount: " + String.valueOf(amount) + "\n";
    } // end toString

} // end Transaction