/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  October 2023
    Composer.java class to represent a composer.
 */

package Module_6.ComposerApp;

public class Composer {

    private int id;
    private String name;
    private String genre;

    /**
     * Default class constructor
     */
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";

    }

    /**
     * Class argument constructor
     *
     * @param id    int
     * @param name  String
     * @param genre double
     */
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    /**
     * An accessor method to get id data field
     *
     * @return int, return the id data field
     */
    public int getId() {
        return id;
    }

    /**
     * An accessor method to get name data field
     *
     * @return String, return the name data field
     */
    public String getName() {
        return name;
    }

    /**
     * An accessor method to get genre data field
     *
     * @return String, return the genre data field
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Overriding toString method
     *
     * @return String, description of a composer with all three data fields, on
     *         separate lines.
     */
    public String toString() {
        return String.format("  ID: %d\n  Name: %s\n  Genre: %s\n", id, name, genre);
    } // end toString

} // end Composer
