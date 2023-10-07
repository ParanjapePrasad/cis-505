/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  October 2023
    GenericDao.java class is an interface to represent the operations in a data persistence layer
 */

package Module_6.ComposerApp;

import java.util.List;

public interface GenericDao<E, K> {

  List<E> findAll();

  E findBy(K key);

  void insert(E entity);

} // end GenericDao
