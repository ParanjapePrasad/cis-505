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

package Module_10.GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ParanjapeGradeBookApp extends Application {

  // TexFields
  private TextField tfFirstName = new TextField(); // First name value
  private TextField tfLastName = new TextField(); // Last name value
  private TextField tfCourse = new TextField(); // Course name value

  // TextArea
  private TextArea taGradeOutput = new TextArea(); // Display output

  // Labels
  private Label lblFirstName = new Label("First Name:"); // First name label
  private Label lblLastName = new Label("Last Name:"); // Last name label;
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

  public static void main(String[] args) {
    launch(args);
  }

} // End ParanjapeGradeBookApp
