/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  November 2023
    Student.java class to represent a student.
 */

package Module_11.GradeBookApp;

public class Student {

    String firstName;
    String lastName;
    String courseName;
    String grade;

    /**
     * Default class constructor
     */
    public Student() {

    }

    /**
     * Class argument constructor
     *
     * @param firstName,  String
     * @param lastName,   String
     * @param courseName, String
     * @param grade,      String
     */

    public Student(String firstName, String lastName, String courseName, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.grade = grade;
    }

    /**
     * An accessor method to get FirstName data field
     *
     * @return String, return the FirstName data field
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Mutator method to set the firstName data field
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * An accessor method to get lastName data field
     *
     * @return String, return the lastName data field
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Mutator method to set the lastName data field
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * An accessor method to get courseName data field
     *
     * @return String, return the courseName data field
     */
    public String getCourseName() {
        return this.courseName;
    }

    /**
     * Mutator method to set the courseName data field
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * An accessor method to get grade data field
     *
     * @return String, return the grade data field
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * Mutator method to set the grade data field
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Overriding toString method
     *
     * @return String, Return an appended string student details
     */
    public String toString() {
        return ("First Name: " + this.firstName + "\n" + "Last Name: " + this.lastName + "\n" + "Course: "
                + this.courseName + "\n" + "Grade: " + this.grade);
    } // End toString

} // End Student
