package com.example.window;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public TextField messegeField;

    @FXML
    public Button setMessegeBoton;

    @FXML
    public TextArea messegeTextArea;

    public void sendingText(ActionEvent actionEvent) {
        if (!messegeField.getText().isEmpty()) {
            messegeTextArea.appendText(messegeField.getText());
            messegeTextArea.appendText(System.lineSeparator());
            messegeField.clear();
        }
    }
}