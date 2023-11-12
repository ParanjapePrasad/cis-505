/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023

    Prasad Paranjape, CIS 505  November 2023
    ParanjapeGradeBookApp.java class is using JavaFX to build a user interface for the GradeBookApp
 */

package Module_11.GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ParanjapeGradeBookApp extends Application {

    // TexFields
    private TextField tfFirstName = new TextField(); // First name value
    private TextField tfLastName = new TextField(); // Last name value
    private TextField tfCourse = new TextField(); // Course name value

    // TextArea
    private TextArea taGradeOutput = new TextArea(); // Display output

    // Labels
    private Label lblFirstName = new Label("First Name:"); // First name label
    private Label lblLastName = new Label("Last Name:"); // Last name label
    private Label lblCourse = new Label("Course:"); // Course name label
    private Label lblGrade = new Label("Grade:"); // Grade label

    // ComboBox
    private ComboBox<String> cbGrade = new ComboBox<String>(); // Grades combo-box

    // Buttons
    private Button btnClear = new Button("Clear"); // clear fields button
    private Button btnViewGrades = new Button("View Grades"); // View grade button
    private Button btnSaveGrades = new Button("Save Grades"); // Save grade button

    /**
     * Start method is the main entry point for all JavaFX applications
     * The JavaFX Stage class is the top-level JavaFX container.
     */
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Paranjape Grade Book App"); // Application Title message

        GridPane pane = new GridPane(); // Create a new Grid Pane
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setVgap(5.5);
        pane.setHgap(5.5);

        HBox actionBtnContainer = new HBox(); // Create a new HBox container
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnViewGrades);
        actionBtnContainer.getChildren().add(btnSaveGrades);
        actionBtnContainer.getChildren().add(btnClear);

        // Button actions
        btnViewGrades.setOnAction(e -> viewGrades()); // View Grades of the student
        btnSaveGrades.setOnAction(e -> saveGrades()); // Save grades of the student
        btnClear.setOnAction(e -> clearFormFields()); // clear all the fields

        cbGrade.setMaxWidth(Double.MAX_VALUE); // Grade ComboBox set to max width to fill row
        cbGrade.getItems().addAll("A", "B", "C", "D", "E", "F"); // Add predefined grades

        // Adding all the fields to the grid pane
        pane.add(lblFirstName, 0, 0);
        pane.add(tfFirstName, 1, 0);
        pane.add(lblLastName, 0, 1);
        pane.add(tfLastName, 1, 1);
        pane.add(lblCourse, 0, 2);
        pane.add(tfCourse, 1, 2);
        pane.add(lblGrade, 0, 3);
        pane.add(cbGrade, 1, 3);
        pane.add(actionBtnContainer, 1, 4);
        pane.add(taGradeOutput, 0, 5, 2, 1);

        Scene scene = new Scene(pane, 350, 350);

        primaryStage.setScene(scene);
        primaryStage.show();

    } // End start

    /**
     * View grades with student details used in 'btnViewGrades' component
     */
    private void viewGrades() {
        try {
            StudentIO studentIO = new StudentIO();
            ArrayList<Student> students = studentIO.findAll();
            StringBuilder stringBuilder = new StringBuilder();
            for (Student student : students) {
                stringBuilder.append(student.toString()).append("\n*************\n");
            }
            taGradeOutput.setText(stringBuilder.toString()); // Display grades from CSV to text area
        } catch (Exception ex) {
            System.out.println("\n  Exception: " + ex.getMessage()); // Print error on the console.
            taGradeOutput.setText("No Grades found!");
        }

    } // End viewGrades

    /**
     * Save grades with student details used in 'btnSaveGrades' component
     */
    private void saveGrades() {
        try {
            StudentIO studentIO = new StudentIO();
            studentIO.insertStudent(
                    new Student(tfFirstName.getText(), tfLastName.getText(), tfCourse.getText(), cbGrade.getValue()));
            clearFormFields();
            taGradeOutput.setText("Grades saved successfully!!");
        } catch (IOException e) { // catch IO exception while accessing CSV file.
            System.out.println("\n  Exception: " + e.getMessage()); // Print error on the console.
            taGradeOutput.setText("Error while saving grades, please try again.");
        }
    } // End saveGrades

    /**
     * Clear all the fields on the screen used in 'btnClear' component
     */
    private void clearFormFields() {
        tfFirstName.setText("");
        tfLastName.setText("");
        tfCourse.setText("");
        cbGrade.setValue(null);
        taGradeOutput.setText("");

    } // End clearFormFields

    public static void main(String[] args) {
        launch(args);
    }

} // End ParanjapeGradeBookApp
