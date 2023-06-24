package com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers;

import com.example.studentattendacneproject.Models.Course;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateCourseController {
    @FXML
    private AnchorPane createCoursePane;
    @FXML private Button butBack;
    @FXML private Button butCreate;
    @FXML private TextField txtId;
    @FXML private TextField txtTopic;
    @FXML private TextField txtBook;
    @FXML private TextField txtNum;
    @FXML private TextField txtInstructor;

    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When create button is pressed
    public void onCreate() {
        model.addCourse(new Course(txtId.getText(), txtTopic.getText(), txtBook.getText(), txtInstructor.getText() , Integer.parseInt((txtNum.getText()))));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The course has been created successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }


    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(createCoursePane, navigation.ADMIN_MAIN_FXML);
    }
}
