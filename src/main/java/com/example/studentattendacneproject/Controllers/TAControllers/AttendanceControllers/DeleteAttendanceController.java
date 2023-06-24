package com.example.studentattendacneproject.Controllers.TAControllers.AttendanceControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteAttendanceController {

    @FXML
    private AnchorPane deleteAttendancePane;
    @FXML private Button butDelete;
    @FXML private Button butBack;
    @FXML private TextField txtLectureId;
    @FXML private TextField txtCourseId;
    @FXML private TextField txtAttend;

    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When delete button is pressed
    public void onDelete() {
        // Delete lecture attendance (in a specific course) to the student lectures record
        (DataModel.getStudentReference(txtAttend.getText())).cancelLectureAttendance((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText()));

        // Delete an attended student to a specific lecture
        ((DataModel.getCourseById(txtCourseId.getText())).getLectureById(txtLectureId.getText())).deleteAttendantStudent(txtAttend.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The attendance has been deleted successfully");
        alert.setTitle("Done");
        alert.showAndWait();    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(deleteAttendancePane, navigation.TA_MAIN_FXML);
    }

}
