package com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers;

import com.example.studentattendacneproject.Models.Course;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteCourseController {
    @FXML
    private AnchorPane deleteCoursePane;
    @FXML private Button butBack;
    @FXML private Button butDelete;
    @FXML private TextField txtId;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();


    // When create button is pressed
    public void onDelete() {
        // if the course exists
        model.deleteCourseById(txtId.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The course has been deleted successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(deleteCoursePane, navigation.ADMIN_MAIN_FXML);
    }
}

