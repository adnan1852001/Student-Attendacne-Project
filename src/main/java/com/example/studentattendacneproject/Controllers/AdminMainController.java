package com.example.studentattendacneproject.Controllers;

import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class AdminMainController {

    @FXML private TabPane adminMainPane;
    @FXML private AnchorPane accountsPane;
    @FXML private AnchorPane coursesPane;
    Navigation navigation = new Navigation();


    // Accounts Pane Buttons ____________________________________________________________________
    @FXML private Button butCreateAccount;
    @FXML private Button butEditAccount;
    @FXML private Button butDeleteAccount;
    @FXML private Button butShowAccounts;


    // Courses Pane Buttons ____________________________________________________________________
    @FXML private Button butCreateCourse;
    @FXML private Button butEditCourse;
    @FXML private Button butDeleteCourse;
    @FXML private Button butShowCourses;
    @FXML private Button butShowStudents;





    public void onLogOut() {
        navigation.navigateTo(adminMainPane, navigation.MAIN_FXML);
    }

    // Accounts Pane Methods ____________________________________________________________________

    // When create account button is pressed
    public void onCreateAccount() {
        navigation.navigateTo(accountsPane, navigation.CREATE_ACCOUNT_FXML);
    }

    // When edit account button is pressed
    public void onEditAccount() {
        navigation.navigateTo(accountsPane, navigation.EDIT_ACCOUNT_FXML);
    }

    // When delete account button is pressed
    public void onDeleteAccount() {
        navigation.navigateTo(accountsPane, navigation.DELETE_ACCOUNT_FXML);
    }

    // When show accounts button is pressed
    public void onShowAccounts() {
        navigation.navigateTo(accountsPane, navigation.SHOW_ACCOUNTS_FXML);
    }


    // Courses Pane Methods ____________________________________________________________________

    // When create course button is pressed
    public void onCreateCourse() {
        navigation.navigateTo(coursesPane, navigation.CREATE_COURSE_FXML);
    }

    // When edit course button is pressed
    public void onEditCourse() {
        navigation.navigateTo(coursesPane, navigation.EDIT_COURSE_FXML);
    }

    // When delete course button is pressed
    public void onDeleteCourse() {
        navigation.navigateTo(coursesPane, navigation.DELETE_COURSE_FXML);
    }

    // When show courses button is pressed
    public void onShowCourses() {
        navigation.navigateTo(coursesPane, navigation.SHOW_COURSES_FXML);
    }

    // When show students button is pressed
    public void onShowStudents() {
        navigation.navigateTo(coursesPane, navigation.SHOW_STUDENTS_FXML);
    }

    // When show students button is pressed
    public void onSearchAbsentStudents() {
        navigation.navigateTo(coursesPane, navigation.SHOW_ABSENT_STUDENT_FXML);
    }


}
