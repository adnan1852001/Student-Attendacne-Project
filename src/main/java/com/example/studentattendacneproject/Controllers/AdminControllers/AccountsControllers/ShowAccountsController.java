package com.example.studentattendacneproject.Controllers.AdminControllers.AccountsControllers;

import com.example.studentattendacneproject.Models.Account;
import com.example.studentattendacneproject.Models.DataModel;
import com.example.studentattendacneproject.Navigation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowAccountsController implements Initializable {
    @FXML
    private AnchorPane showAccountsPane;
    @FXML private Button butBack;
    @FXML private ListView<Account> lstAccounts;
    Navigation navigation = new Navigation();
    DataModel model = new DataModel();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstAccounts.setItems(FXCollections.observableArrayList(model.getAccounts()));
    }

    // When back button is pressed
    public void onBack() {
        navigation.navigateTo(showAccountsPane, navigation.ADMIN_MAIN_FXML);
    }
}
