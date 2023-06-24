package com.example.studentattendacneproject.Controllers.AdminControllers.AccountsControllers;

import com.example.studentattendacneproject.Models.Account;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class CreateAccountController {
    @FXML private AnchorPane createAccountPane;
    @FXML private Button butCreate;
    @FXML private Button butBack;
    @FXML private TextField txtUsername;
    @FXML private PasswordField password;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When create button is pressed
    public void onCreate() {
        model.addAccount(new Account(txtUsername.getText(), password.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The account has been created successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(createAccountPane, navigation.ADMIN_MAIN_FXML);
    }
}
