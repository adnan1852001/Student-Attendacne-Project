package com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Lecture;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteLectureController {
    @FXML private AnchorPane deleteLecturePane;
    @FXML private Button butDelete;
    @FXML private Button butBack;
    @FXML private TextField txtCourse;
    @FXML private TextField txtLectureId;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When delete button is pressed
    public void onDelete() {
        // Delete lecture from the course
        (DataModel.getCourseById(txtCourse.getText())).deleteLectureById(txtLectureId.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The lecture has been deleted successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(deleteLecturePane, navigation.TA_MAIN_FXML);
    }

}
