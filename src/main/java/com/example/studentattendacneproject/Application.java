package com.example.studentattendacneproject;

import com.example.studentattendacneproject.Models.Course;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Models.Lecture;
import com.example.studentattendacneproject.Models.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Optional;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Views/MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 400);
        stage.setTitle("Student Attendance");
        stage.setScene(scene);
        stage.resizableProperty().set(false);
        stage.show();

        stage.setOnCloseRequest(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("The program will be closed");
            alert.setHeaderText("Do you want to save the entered data?");
            alert.setContentText(null);

            ButtonType save = new ButtonType("Save", ButtonBar.ButtonData.OK_DONE);
            ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.FINISH);
            ButtonType do_not_save = new ButtonType("Don't Save", ButtonBar.ButtonData.CANCEL_CLOSE);

            alert.getButtonTypes().setAll(save, cancel, do_not_save);

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == save) {
                DataModel model = new DataModel();
                model.save_Students();
                model.save_Accounts();
                model.save_Courses();
            } else if (result.get() == cancel) {
                event.consume();
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}