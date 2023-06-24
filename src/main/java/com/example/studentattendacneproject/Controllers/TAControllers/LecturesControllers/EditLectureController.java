package com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers;

import com.example.studentattendacneproject.Models.Course;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditLectureController {

    @FXML private AnchorPane editLecturePane;
    @FXML private Button butEdit;
    @FXML private Button butBack;
    @FXML private TextField txtCourseNum;
    @FXML private TextField txtLecId;
    @FXML private TextField txtTitle;
    @FXML private TextField txtRoom;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When edit button is pressed
    public void onEdit() {
        // Edit lecture in all lectures array

        // Edit lecture in the course
        ((DataModel.getCourseById(txtCourseNum.getText())).getLectureById(txtLecId.getText())).setRoom(txtRoom.getText());
        ((DataModel.getCourseById(txtCourseNum.getText())).getLectureById(txtLecId.getText())).setTitle(txtTitle.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The lecture has been edited successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(editLecturePane, navigation.TA_MAIN_FXML);
    }

}
