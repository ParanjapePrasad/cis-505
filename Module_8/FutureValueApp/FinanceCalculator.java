/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  October 2023
    FinanceCalculator.java class is to calculate the interest rate by using the formula for the FutureValueApp
 */

package Module_8.FutureValueApp;

public class FinanceCalculator {

    private static int MONTHS_IN_YEAR = 12;

    /**
     * Calculate the future value using interest formula and present value
     *
     * @param monthlyPayment, double
     * @param rate,           double
     * @param years,          integer
     * @return double, calculated future value
     */
    static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        double presentValue = monthlyPayment * years * MONTHS_IN_YEAR;
        return presentValue * (Math.pow(1 + (rate / 100), years * MONTHS_IN_YEAR));

    } // End calculateFutureValue

} // End FinanceCalculator
