package com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteStudentController {
    @FXML
    private AnchorPane deleteStudentPane;
    @FXML private Button butDelete;
    @FXML private Button butBack;
    @FXML private TextField txtId;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When delete button is pressed
    public void onDelete() {
        model.deleteStudentById(txtId.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The student has been added successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(deleteStudentPane, navigation.TA_MAIN_FXML);
    }
}
