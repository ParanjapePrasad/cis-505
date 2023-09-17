/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September, 2023
    Customer.java class to represent a customer
 */

package Module_3.CustomerAccountApp;

public class Customer {

    private String name;
    private String address;
    private String city;
    private String zip;

    /**
     * Default class constructor
     */
    public Customer() {
        this.name = "Prasad Paranjape";
        this.address = "4252 Abc dr";
        this.city = "Okemos";
        this.zip = "12345";
    }

    /**
     *
     * Class argument constructor
     * 
     * @param name,    String
     * @param address, String
     * @param city,    String
     * @param zip,     String
     */
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    /**
     * Accessor method to get customer's name
     * 
     * @return String, returns the name data field
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method to get customer's address
     * 
     * @return String, returns the address data field
     */
    public String getAddress() {
        return address;
    }

    /**
     * Accessor method to get customer's city
     * 
     * @return String, returns the city data field
     */
    public String getCity() {
        return city;
    }

    /**
     * Accessor method to get customer's zip
     * 
     * @return String, returns the zip data field
     */
    public String getZip() {
        return zip;
    }

    /**
     * Overriding toString method
     * 
     * @return String, customer details in required format
     */
    public String toString() {
        return "\n  --Customer Details--\n  Name: " + this.name + "\n  Address: " + this.address + "\n  City: " + this.city
                + "\n  Zip: " + this.zip;
    } // end toString

}