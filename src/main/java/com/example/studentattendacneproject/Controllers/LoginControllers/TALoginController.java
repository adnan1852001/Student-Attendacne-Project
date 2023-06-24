package com.example.studentattendacneproject.Controllers.LoginControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TALoginController {

    @FXML private AnchorPane TALoginPane;
    @FXML private Button butLogin;
    @FXML private PasswordField password;
    @FXML private TextField txtUserName;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When logIn button is pressed
    public void onLogin() {
        // CheckPassword and Registration
        if (model.checkAccount(txtUserName.getText(), password.getText()))
            navigation.navigateTo(TALoginPane, navigation.TA_MAIN_FXML);
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Incorrect username or password");
            alert.setTitle("Error");
            alert.showAndWait();
        }
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(TALoginPane, navigation.MAIN_FXML);
    }


}
