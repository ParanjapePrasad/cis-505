/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  October 2023
    TestComposerApp.java class to test the classes Composer and MemComposerDao
 */

package Module_6.ComposerApp;

import java.util.Scanner;

public class TestComposerApp {

    public static void main(String[] args) {
        System.out.println("  Welcome to the Composer App\n"); // Welcome message
        Scanner sc = new Scanner(System.in); // Scanner object to handle user prompts
        MemComposerDao memComposerDao = new MemComposerDao(); // Create new MemComposerDao object for use in while loop

        whileLoop: while (true) {
            System.out.print("  MENU OPTIONS\n    1. View Composers\n    2. Find Composer\n    3. Add Composer\n    " +
                    "4. Exit\n\n  Please choose an option: "); // Display Composers menu
            String input = sc.next();
            System.out.println();

            switch (input) {
                case "1": // option one is selected, display a list of composers
                    System.out.print("  --DISPLAYING COMPOSER--\n");
                    for (Composer composer : memComposerDao.findAll()) {
                        System.out.print(composer.toString() + "\n");
                    }
                    break;
                case "2": // option two is selected, prompt the user to enter an id and display the
                          // selected composer
                    System.out.print("  Enter an id: ");
                    String idNum = sc.next();
                    System.out.print("  --DISPLAYING COMPOSER--\n");
                    System.out.print(memComposerDao.findBy(Integer.valueOf(idNum)).toString() + "\n");
                    break;
                case "3": // option three is selected, prompt the user to create a new composer
                    System.out.print("  Enter an id: ");
                    String newId = sc.next();
                    sc.nextLine();
                    System.out.print("  Enter a name: ");
                    String newName = sc.nextLine();
                    System.out.print("  Enter a genre: ");
                    String newGenre = sc.nextLine();
                    System.out.println();
                    memComposerDao.insert(new Composer(Integer.parseInt(newId), newName, newGenre));
                    break;
                case "4": // User selects invalid menu
                    break whileLoop;
                default:
                    System.out.println("  Invalid input\n");
                    break;
            }
        }
        sc.close();
    } // end main
} // end TestComposerApp class
