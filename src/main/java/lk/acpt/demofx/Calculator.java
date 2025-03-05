package lk.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Calculator {

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    int result;

    @FXML
    void addition(ActionEvent event) {
        int num1 = Integer.parseInt(input1.getText());
        int num2 = Integer.parseInt(input2.getText());
        int sum = num1 + num2;
        result = sum;

    }

    @FXML
    void division(ActionEvent event) {
        int num1 = Integer.parseInt(input1.getText());
        int num2 = Integer.parseInt(input2.getText());
        int sum = num1 / num2;
        result = sum;
    }

    @FXML
    void multiplication(ActionEvent event) {
        int num1 = Integer.parseInt(input1.getText());
        int num2 = Integer.parseInt(input2.getText());
        int sum = num1 * num2;
        result = sum;
    }

    @FXML
    void submit(ActionEvent event) {
        System.out.println("sum is: " + result);
    }

    @FXML
    void substraction(ActionEvent event) {
        int num1 = Integer.parseInt(input1.getText());
        int num2 = Integer.parseInt(input2.getText());
        int sum = num1 - num2;
        result = sum;
    }

}

