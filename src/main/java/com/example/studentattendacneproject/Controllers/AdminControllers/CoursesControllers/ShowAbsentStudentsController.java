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

public class ShowAbsentStudentsController {
    @FXML private AnchorPane searchAbsentStudentsPane;
    @FXML private Button butShow;
    @FXML private Button butBack;
    @FXML private TextField txtCourse;
    @FXML private ListView<Student> lstAbsent;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When omit button is pressed
    public void onShow() {
        lstAbsent.setItems(FXCollections.observableArrayList((DataModel.getCourseById(txtCourse.getText())).getAbsentStudents()));
    }


    public void onExport() {
        model.exportAbsentToExcel((DataModel.getCourseById(txtCourse.getText())));
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(searchAbsentStudentsPane, navigation.ADMIN_MAIN_FXML);
    }
}
