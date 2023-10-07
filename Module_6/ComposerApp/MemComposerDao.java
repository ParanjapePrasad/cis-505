/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  October 2023
    MemComposerDao.java class  to represent the operations in a composer data persistence layer
 */

package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {

    private List<Composer> composers = new ArrayList<Composer>();

    /**
     * Default class constructor
     */
    public MemComposerDao() {
        composers.add(new Composer(1007, "Ludwig van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    /**
     * Overriding findAll method
     *
     * @return List, a list of composer objects
     */
    public List<Composer> findAll() {
        return composers;
    } // end findAll

    /**
     * Overriding findBy method
     *
     * @param id Integer
     * @return composer, returns a single composer object matching the arguments id
     */
    public Composer findBy(Integer id) {
        for (Composer composer : composers) {
            if (composer.getId() == id) {
                return composer;
            }
        }
        return new Composer();
    } // end findBy

    /**
     * Overriding the insert method
     *
     * @param composer
     */
    public void insert(Composer composer) {
        composers.add(composer);
    } // end insert

} // end MemComposerDao class
