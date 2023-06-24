package com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Student;
import com.example.studentattendacneproject.Navigation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ShowAttendanceController {
    @FXML
    private AnchorPane showAttendancePane;
    @FXML private Button butShow;
    @FXML private Button butBack;
    @FXML private Button butSearchByTitle;
    @FXML private TextField txtCourseId;
    @FXML private TextField txtLectureId;
    @FXML private Label numberOfAttendance;
    @FXML private Label percentageOfAttendance;
    @FXML private ListView<Student> lstAttendance;

    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When show button is pressed
    public void onShow() {
        lstAttendance.setItems(FXCollections.observableArrayList(((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText())).getAttendance()));

        // Find attendance number and percentage
        double RegisteredStudentsNumber = (DataModel.getCourseById(txtCourseId.getText())).getStudentList().size();
        double numberOfAttendance = (((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText())).getAttendance().size());
        double x = (numberOfAttendance / RegisteredStudentsNumber) * 100;

        this.numberOfAttendance.setText(String.valueOf((int) numberOfAttendance));
        percentageOfAttendance.setText(String.format("%.2f%%", x));
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(showAttendancePane, navigation.TA_MAIN_FXML);
    }

    // When SearchByTitle button is pressed
    public void onSearchByTitle() {
        navigation.navigateTo(showAttendancePane, navigation.SHOW_LECTURE_ATTENDANCE_BY_TITLE_FXML);
    }
}
