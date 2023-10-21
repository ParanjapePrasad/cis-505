/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  October 2023
    ParanjapeEnhancedFutureValueApp.java class is using JavaFX to build a user interface for the FutureValueApp
 */

package Module_8.FutureValueApp;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.HPos;
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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParanjapeEnhancedFutureValueApp extends Application {

    // TextField
    private TextField tfMonthlyPayment = new TextField(); // Monthly Payment value
    private TextField tfInterestRate = new TextField(); // Interest Rate value

    // TextArea
    private TextArea taOutput = new TextArea(); // Display output

    // Label
    private Label lblMonthlyPayment = new Label("Monthly Payment:"); // Monthly Payment label
    private Label lblInterestRate = new Label("Interest Rate:"); // Interest Rate label
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1"); // Interest Rate Format message label
    private Label lblYears = new Label("Years:"); // Year Combo-box label
    private Label lblFutureValueDate = new Label(); //

    // ComboBox
    private ComboBox<Integer> cbYears = new ComboBox<Integer>(); // Year combo-box

    // Button
    private Button btnCalculate = new Button("Calculate"); // Calculate button to show final result
    private Button btnClear = new Button("Clear"); // clear fields button

    /**
     * Start method is the main entry point for all JavaFX applications
     * The JavaFX Stage class is the top-level JavaFX container.
     */
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Paranjape Future Value App."); // Application Title message

        lblInterestRateFormat.setTextFill(Color.RED);
        cbYears.setPrefWidth(165);
        cbYears.getItems().addAll(generatorYear(30)); // Adding number of years to the combo-box

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        HBox actionBtnContainer = new HBox(); // Create a new HBox container
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);

        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);

        // Button actions
        btnClear.setOnAction(e -> clearFormFields()); // clear all the fields
        btnCalculate.setOnAction(e -> calculateResults()); // Calculate the future value

        // adding all the fields to the grid pane
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(tfMonthlyPayment, 1, 0);
        pane.add(lblInterestRate, 0, 1);
        pane.add(tfInterestRate, 1, 1);
        pane.add(lblInterestRateFormat, 1, 2);
        pane.add(lblYears, 0, 3);
        pane.add(cbYears, 1, 3);
        pane.add(actionBtnContainer, 1, 4);
        pane.add(lblFutureValueDate, 0, 5, 2, 1);
        pane.add(taOutput, 0, 6, 2, 1);
        pane.autosize();

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();

    } // End start

    /**
     * Clear all the fields on the screen used in 'btnClear' component
     */
    private void clearFormFields() {
        tfMonthlyPayment.setText("");
        tfInterestRate.setText("");
        taOutput.setText("");
        lblFutureValueDate.setText("");
        cbYears.setValue(0);

    } // End clearFormFields

    /**
     * Generate the future value based on the user input and display result in the
     * TextArea
     */
    private void calculateResults() {

        if (!tfMonthlyPayment.getText().isEmpty() && !tfInterestRate.getText().isEmpty()
                && !cbYears.getSelectionModel().isEmpty()) {

            double futureValue = FinanceCalculator.calculateFutureValue(Double.parseDouble(tfMonthlyPayment.getText()),
                    Double.parseDouble(tfInterestRate.getText()), cbYears.getValue());

            lblFutureValueDate.setText("Calculation as of " + dateOfCalculation());
            taOutput.setText(String.format("The future value is $%,.2f", futureValue));
        }

    } // End calculateResults

    /**
     * Generate the today's date
     *
     * @return String, Current date in MM/dd/yyyy format
     */
    private String dateOfCalculation() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(new Date());

    } // End dateOfCalculation

    /**
     * Generate a list of numbers to the specified size
     *
     * @param size, Maximum number of year to generate
     * @return the Integer array
     */
    private Integer[] generatorYear(int size) {
        Integer[] result = new Integer[size + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    } // End generatorYear

    public static void main(String[] args) {
        launch(ParanjapeEnhancedFutureValueApp.class, args);
    }

} // End ParanjapeFutureValueApp