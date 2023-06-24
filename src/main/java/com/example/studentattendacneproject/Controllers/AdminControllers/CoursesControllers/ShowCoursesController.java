package com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers;

import com.example.studentattendacneproject.Models.Course;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowCoursesController implements Initializable {

    @FXML private AnchorPane showCoursesPane;
    @FXML private Button butBack;
    @FXML private ListView<Course> lstCourses;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstCourses.setItems(FXCollections.observableArrayList(model.getCourses()));
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(showCoursesPane, navigation.ADMIN_MAIN_FXML);
    }
}
