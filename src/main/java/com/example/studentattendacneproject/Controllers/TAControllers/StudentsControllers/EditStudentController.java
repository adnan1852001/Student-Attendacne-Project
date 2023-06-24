package com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers;

import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class EditStudentController {
    @FXML
    private AnchorPane editStudentPane;
    @FXML private Button butEdit;
    @FXML private Button butBack;
    Navigation navigation = new Navigation();


    // When add button is pressed
    public void onEdit() {
        // Course.getCourseFromName(); // TODO
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(editStudentPane, navigation.TA_MAIN_FXML);
    }
}
