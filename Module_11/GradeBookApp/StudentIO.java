/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  November 2023
    StudentIO.java class for reading and writing transactions to a CSV file
 */

package Module_11.GradeBookApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentIO {
    private static final String FILE_NAME = "./grades.csv";
    private static final File file = new File(FILE_NAME);
    private String CSV_HEADER = "FirstName,LastName,Course,Grade";

    /**
     * Method to transform and return all Student objects contained
     * within the CSV file
     *
     * @return students ArrayList<Student>
     * @throws FileNotFoundException exception
     */
    ArrayList<Student> findAll() throws FileNotFoundException {
        Scanner scanner = new Scanner(file); // Create scanner object for the CSV file

        if (scanner.hasNextLine()) { // Skip the header row
            scanner.nextLine();
        }
        ArrayList<Student> students = new ArrayList<>();
        while (scanner.hasNextLine()) { // Read the file till end
            String[] data = scanner.nextLine().split(",");
            students.add(new Student(data[0], data[1], data[2], data[3]));
        }
        scanner.close(); // Close the scanner stream
        return students;
    } // End findAll

    /**
     * Method to insert a student details into the CSV file
     *
     * @param student Student
     * @throws FileNotFoundException exception
     */
    public void insertStudent(Student student) throws FileNotFoundException {
        PrintWriter writer;
        if (file.exists()) { // check file exists
            writer = new PrintWriter(new FileOutputStream(FILE_NAME, true));
        } else { // Create new file with header row
            writer = new PrintWriter(FILE_NAME);
            writer.print(CSV_HEADER);
        }
        writer.print("\n" + student.getFirstName() + "," + student.getLastName() + "," + student.getCourseName() + ","
                + student.getGrade()); // save student details in the CSV file
        writer.close(); // close the PrintWriter stream
    }
} // End StudentIO
