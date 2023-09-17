 /*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023

    JavaTpoint (n.d.). Java SimpleDateFormat. https://www.javatpoint.com/java-simpledateformat
    
    Prasad Paranjape, CIS 505  September, 2023
    Account.java class to manage and represent accounts for customers
 */

package Module_3.CustomerAccountApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    private double balance = 200.00;

    /**
     * An accessor method to get account balance
     * 
     * @return double, return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method with one argument, to increase the running total balance
     *
     * @param amt
     */
    public void deposit(double amt) {
        balance += amt;
    } // end deposit

    /**
     * Method with one argument, to decrease the running total balance with
     * condition
     * 
     * @param amt
     */
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    } // end withdraw

    /**
     * Print a menu to customer in required format
     */
    public void displayMenu() {
        System.out.println(
                "\n  Account Menu \n  Enter (D/d) for deposit\n  Enter (W/w) for withdraw \n  Enter (B/b) for balance ");
    } // end displayMenu

    /**
     * @return String, returns today's date in the MM-dd-yyyy format
     */
    public String getTransactionDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        return dateFormat.format(new Date());
    } // end getTransactionDate

} // end Account