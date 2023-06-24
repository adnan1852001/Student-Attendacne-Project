package com.example.studentattendacneproject.Controllers.TAControllers.AttendanceControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Student;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class AddAttendanceController {
    @FXML private AnchorPane addAttendancePane;
    @FXML private Button butAdd;
    @FXML private Button butBack;
    @FXML private Button butImport;
    @FXML private TextField txtCourseId;
    @FXML private TextField txtLectureId;
    @FXML private TextField txtAttend;
    @FXML private TextField txtPath;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When add button is pressed
    public void onAdd() {
        // Add lecture attendance (in a specific course) to the student lectures record
        (DataModel.getStudentReference(txtAttend.getText())).updateLecturesRecord((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText()));

        // Add an attended student to a specific lecture
        ((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText())).addAttendantStudent(txtAttend.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The attendance has been added successfully");
        alert.setTitle("Done");
        alert.showAndWait();

    }

    // TODO
    // When import button is pressed
//    public void onImport() {
//
//        try {
//            ArrayList<Student> attendance = model.importAttendanceFromExcel(txtPath.getText());
//
//            for (Student student: attendance) {
//                student.updateLecturesRecord((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText()));
//                ((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText())).addAttendantStudent(student.getId());
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("The attendance has been added successfully");
//        alert.setTitle("Done");
//        alert.showAndWait();
//    }


    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(addAttendancePane, navigation.TA_MAIN_FXML);
    }

}
