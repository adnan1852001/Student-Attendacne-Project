package com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditCourseController {

    @FXML private AnchorPane editCoursePane;
    @FXML private Button butBack;
    @FXML private Button butEdit;
    @FXML private TextField txtCourse;
    @FXML private TextField txtTopic;
    @FXML private TextField txtBook;
    @FXML private TextField txtInstructor;
    @FXML private TextField txtNum;

    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When create button is pressed
    public void onEdit() {
        DataModel.getCourseById(txtCourse.getText()).setTopic(txtTopic.getText());
        DataModel.getCourseById(txtCourse.getText()).setTextBook(txtBook.getText());
        DataModel.getCourseById(txtCourse.getText()).setInstructor(txtInstructor.getText());
        DataModel.getCourseById(txtCourse.getText()).setLecturesNumber(Integer.parseInt(txtNum.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The course has been edited successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(editCoursePane, navigation.ADMIN_MAIN_FXML);
    }
}
