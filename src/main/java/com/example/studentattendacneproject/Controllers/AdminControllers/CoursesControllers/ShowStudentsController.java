package com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Student;
import com.example.studentattendacneproject.Navigation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.List;

public class ShowStudentsController {
    @FXML
    private AnchorPane showStudentsPane;
    @FXML private Button butShow;
    @FXML private Button butBack;
    @FXML private TextField txtCourseId;
    @FXML private ListView<Student> lstStudents;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When show button is pressed
    public void onShow() {
        lstStudents.setItems(FXCollections.observableArrayList((DataModel.getCourseById(txtCourseId.getText())).getStudentList()));
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(showStudentsPane, navigation.ADMIN_MAIN_FXML);
    }
}
