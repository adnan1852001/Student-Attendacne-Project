package com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Lecture;
import com.example.studentattendacneproject.Navigation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ShowStudentAttendanceController {
    @FXML private AnchorPane showStudentAttendancePane;
    @FXML private Button butShow;
    @FXML private Button butBack;
    @FXML private Button butEdit;
    @FXML private ListView<Lecture> lstStudentAttendance;
    @FXML private TextField txtCourseId;
    @FXML private TextField txtStudentId;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When show button is pressed
    public void onShow() {
        // Show student attended lectures Record
        lstStudentAttendance.setItems(FXCollections.observableArrayList((DataModel.getStudentReference(txtStudentId.getText()).getLecturesRecord())));
    }

    // When edit button is pressed
    public void onEdit() {
        navigation.navigateTo(showStudentAttendancePane, navigation.DELETE_ATTENDANCE_FXML);
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(showStudentAttendancePane, navigation.TA_MAIN_FXML);
    }
}
