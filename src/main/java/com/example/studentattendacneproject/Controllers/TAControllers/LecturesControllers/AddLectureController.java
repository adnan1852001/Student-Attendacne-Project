package com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Lecture;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddLectureController {

    @FXML private AnchorPane addLecturePane;
    @FXML private Button butAdd;
    @FXML private Button butBack;
    @FXML private TextField txtCourse;
    @FXML private TextField txtId;
    @FXML private TextField txtTitle;
    @FXML private TextField txtRoom;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When add button is pressed
    public void onAdd() {
        // add lecture to the course
        (DataModel.getCourseById(txtCourse.getText())).addLecture(new Lecture(txtId.getText(), txtTitle.getText(), txtRoom.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The lecture has been added successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(addLecturePane, navigation.TA_MAIN_FXML);
    }

}
