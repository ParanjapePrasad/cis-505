/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    TransactionIO.java class for reading and writing transactions to a text file
 */

package Module_5.ExpenseTracker;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionIO {

    private static String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    /**
     * Method to insert an ArrayList of Transactions into the Transactions file
     *
     * @param transactions ArrayList<Transaction>
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {

        PrintWriter output = null;

        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        output.close();

    } // end bulkInsert

    /**
     * Method to transform and return all Transaction objects contained
     * within the Transaction file
     *
     * @return ArrayList<Transaction>
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException {

        Scanner input = new Scanner(file);
        //System.out.println(file.getAbsolutePath());
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        while (input.hasNext()) {
            transactions.add(new Transaction(input.next(), input.next(), input.nextDouble()));
        }

        input.close();
        return transactions;

    } // end findAll

} // end TransactionIO