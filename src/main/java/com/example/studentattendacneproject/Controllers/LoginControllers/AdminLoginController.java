package com.example.studentattendacneproject.Controllers.LoginControllers;

import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdminLoginController {

    @FXML private AnchorPane adminLoginPane;
    @FXML private Button butLogin;
    @FXML private PasswordField password;
    @FXML private TextField txtUserName;
    Navigation navigation = new Navigation();

    // When logIn button is pressed
    public void onLogin() {
        // CheckPassword and Registration
        if ((txtUserName.getText().equals("abc")) && (password.getText().equals("123")))
            navigation.navigateTo(adminLoginPane, navigation.ADMIN_MAIN_FXML);
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Incorrect username or password");
            alert.setTitle("Error");
            alert.showAndWait();
        }
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(adminLoginPane, navigation.MAIN_FXML);
    }

}
