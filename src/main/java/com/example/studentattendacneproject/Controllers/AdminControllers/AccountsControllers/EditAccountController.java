package com.example.studentattendacneproject.Controllers.AdminControllers.AccountsControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditAccountController {
    @FXML private AnchorPane editAccountPane;
    @FXML private Button butEdit;
    @FXML private Button butBack;
    @FXML private TextField txtUsername;
    @FXML private TextField txtOldPass;
    @FXML private TextField txtNewPass;
    Navigation navigation = new Navigation();


    // When edit button is pressed
    public void onEdit() {
        (DataModel.getAccountByUsername(txtUsername.getText())).setPassword(txtNewPass.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The account has been edited successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(editAccountPane, navigation.ADMIN_MAIN_FXML);
    }
}
