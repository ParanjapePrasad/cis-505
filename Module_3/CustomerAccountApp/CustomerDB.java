 /*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023

    Prasad Paranjape, CIS 505  September, 2023
    CustomerDB.java class to create different customers
    
 */

package Module_3.CustomerAccountApp;

public class CustomerDB {
    
    /**
     * Create different customer depending on the customer id
     * 
     * @param id integer, customer id
     * @return customer
     */
    public static Customer getCustomer(int id) {
        if(id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        }
        else if(id == 1008) {
            return new Customer("Michael Jordan", "1258 Arbor Dr.", "Lansing", "47764");
        }
        else if(id == 1009) {
            return new Customer("Taylor Swift", "2241 Greenwood Dr.", "Okemos", "48864");
        }
        else {
            return new Customer();
        }
    } // end getCustomer

}