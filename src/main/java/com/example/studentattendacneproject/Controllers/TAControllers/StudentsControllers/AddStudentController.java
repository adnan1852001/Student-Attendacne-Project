package com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Student;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddStudentController {
    @FXML
    private AnchorPane addStudentPane;
    @FXML private Button butAdd;
    @FXML private Button butBack;
    @FXML private TextField fName;
    @FXML private TextField secName;
    @FXML private TextField thName;
    @FXML private TextField foName;
    @FXML private TextField txtId;
    @FXML private TextField txtAddress;
    @FXML private TextField txtNum;

    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When add button is pressed
    public void onAdd() {
        model.addStudent(new Student(txtId.getText(), fName.getText(), secName.getText(), thName.getText(), foName.getText(), txtNum.getText(), txtAddress.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The student has been added successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(addStudentPane, navigation.TA_MAIN_FXML);
    }
}
