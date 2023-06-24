package com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Student;
import com.example.studentattendacneproject.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class JoinCourseController {
    @FXML private AnchorPane joinCoursePane;
    @FXML private Button butJoin;
    @FXML private Button butBack;
    @FXML private TextField txtStudentId;
    @FXML private TextField txtCourseId;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When add button is pressed
    public void onJoin() {
        (DataModel.getCourseById(txtCourseId.getText())).addStudent(DataModel.getStudentReference(txtStudentId.getText()));
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(joinCoursePane, navigation.TA_MAIN_FXML);
    }

}
