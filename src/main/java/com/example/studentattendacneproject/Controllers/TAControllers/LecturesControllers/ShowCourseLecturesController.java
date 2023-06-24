package com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Lecture;
import com.example.studentattendacneproject.Navigation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ShowCourseLecturesController {
    @FXML private AnchorPane showLecturesPane;
    @FXML private Button butShow;
    @FXML private Button butBack;
    @FXML private ListView<Lecture> lstAllLectures;
    @FXML private TextField txtCourseId;
    Navigation navigation = new Navigation();


    // When show button is pressed
    public void onShow() {
        // If course is found
//        navigation.navigateTo(showLecturesPane, navigation.SHOW_LECTURES_RESULT_FXML);

        lstAllLectures.setItems(FXCollections.observableArrayList((DataModel.getCourseById(txtCourseId.getText())).getLecturesList()));

    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(showLecturesPane, navigation.TA_MAIN_FXML);
//        navigation.navigateTo(showLecturesPane, navigation.SHOW_LECTURES_FXML);
    }
}
