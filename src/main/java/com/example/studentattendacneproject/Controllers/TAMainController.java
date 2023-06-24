package com.example.studentattendacneproject.Controllers;

import com.example.studentattendacneproject.Navigation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class TAMainController {

    @FXML private TabPane TAMainPane;
    @FXML private AnchorPane lecturesPane;
    @FXML private AnchorPane studentsPane;
    @FXML private AnchorPane attendancePane;
    Navigation navigation = new Navigation();

    // Lectures Pane Buttons ____________________________________________________________________
    @FXML private Button butAddLecture;
    @FXML private Button butEditLecture;
    @FXML private Button butDeleteLecture;
    @FXML private Button butShowLectures;
    @FXML private Button butShowLectureAttendance;



    // Students Pane Buttons ____________________________________________________________________

    @FXML private Button butAddStudent;
    @FXML private Button butEditStudent;
    @FXML private Button butDeleteStudent;
    @FXML private Button butShowStudents;
    @FXML private Button butShowStudentAttendance;
    @FXML private Button butJoinCourse;



    // Attendance Pane Buttons ____________________________________________________________________

    @FXML private Button butAddAttendance;
    @FXML private Button butDeleteAttendance;



    public void onLogOut() {
        navigation.navigateTo(TAMainPane, navigation.MAIN_FXML);
    }


    // Lectures Pane Methods ____________________________________________________________________

    // When add lecture button is pressed
    public void onAddLecture() {
        navigation.navigateTo(lecturesPane, navigation.ADD_LECTURE_FXML);
    }

    // When edit lecture button is pressed
    public void onEditLecture() {
        navigation.navigateTo(lecturesPane, navigation.EDIT_LECTURE_FXML);
    }

    // When delete lecture button is pressed
    public void onDeleteLecture() {
        navigation.navigateTo(lecturesPane, navigation.DELETE_LECTURE_FXML);
    }

    // When show lectures button is pressed
    public void onShowLectures() {
        navigation.navigateTo(lecturesPane, navigation.SHOW_LECTURES_FXML);
    }

    // When show lecture attendance button is pressed
    public void onShowLectureAttendance() {
        navigation.navigateTo(lecturesPane, navigation.SHOW_ATTENDANCE_FXML);
    }



    // Students Pane Methods ____________________________________________________________________

    // When add student button is pressed
    public void onAddStudent() {
        navigation.navigateTo(studentsPane, navigation.ADD_STUDENT_FXML);
    }

    // When edit student button is pressed
    public void onEditStudent() {
        navigation.navigateTo(studentsPane, navigation.EDIT_STUDENT_FXML);
    }

    // When delete student button is pressed
    public void onDeleteStudent() {
        navigation.navigateTo(studentsPane, navigation.DELETE_STUDENT_FXML);
    }

    // When show student attendance button is pressed
    public void onShowStudentAttendance() {
        navigation.navigateTo(studentsPane, navigation.SHOW_STUDENT_ATTENDANCE_FXML);
    }

    // When join course button is pressed
    public void onJoinCourse() {
        navigation.navigateTo(studentsPane, navigation.JOIN_COURSE_FXML);
    }


    // Attendance Pane Methods ____________________________________________________________________

    // When add attendance button is pressed
    public void onAddAttendance() {
        navigation.navigateTo(attendancePane, navigation.ADD_ATTENDANCE_FXML);
    }

    // When show all attendance button is pressed
    public void onDeleteAttendance() {
        navigation.navigateTo(attendancePane, navigation.DELETE_ATTENDANCE_FXML);
    }

}
