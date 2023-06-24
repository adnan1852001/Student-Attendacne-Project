package com.example.studentattendacneproject.Controllers.AdminControllers.AccountsControllers;

import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DeleteAccountController {
    @FXML private AnchorPane deleteAccountPane;
    @FXML private Button butDelete;
    @FXML private Button butBack;
    @FXML private TextField txtUsername;

    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    // When add button is pressed
    public void onDelete() {
        model.deleteAccountByName(txtUsername.getText());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The account has been deleted successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(deleteAccountPane, navigation.ADMIN_MAIN_FXML);
    }
}
