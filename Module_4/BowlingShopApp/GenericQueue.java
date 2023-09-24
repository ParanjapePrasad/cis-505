/*
   Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
     Comprehensive Version (12th ed.). Pearson Education, Inc. 
   Modified by P. Prasad 2023

   Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

   Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
   Modified by P. Prasad 2023
   
   Prasad Paranjape, CIS 505  September 2023
   
   GenericQueue.java class to manage and represent queue
*/

package Module_4.BowlingShopApp;

import java.util.LinkedList;

public class GenericQueue<E> {
    private final LinkedList<E> list = new LinkedList<>();

    /**
     * enqueue method to adds the item to the list
     *
     * @param item E
     */
    public void enqueue(E item) {
        list.addFirst(item);
    } // end enqueue

    /**
     * dequeue method to remove the item from the LinkedList
     *
     * @return item E
     */
    public E dequeue() {
        return list.removeLast();
    } // end dequeue

    /**
     * size method to return the number of items in the LinkedList
     * 
     * @return int, the size of the list
     */
    public int size() {
        return list.size();
    } // end size

} // end GenericQueue
