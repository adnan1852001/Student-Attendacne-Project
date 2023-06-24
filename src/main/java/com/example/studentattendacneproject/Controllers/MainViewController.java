package com.example.studentattendacneproject.Controllers;

import com.example.studentattendacneproject.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainViewController {

    @FXML private AnchorPane mainViewRoot;
    @FXML private Button butAdminLogin;
    @FXML private Button butTALogin;
    Navigation navigation = new Navigation();

    public void adminLogin() {
        navigation.navigateTo(mainViewRoot, navigation.ADMIN_LOGIN_FXML);
    }

    public void TALogin() {
        navigation.navigateTo(mainViewRoot, navigation.TA_LOGIN_FXML);
    }

}
