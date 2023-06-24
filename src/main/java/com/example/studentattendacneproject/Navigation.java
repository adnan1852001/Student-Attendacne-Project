package com.example.studentattendacneproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Objects;

public class Navigation {

    public final String MAIN_FXML = "views/MainView.fxml";

    // Login
    public final String ADMIN_LOGIN_FXML = "views/LoginViews/AdminLogin.fxml";
    public final String TA_LOGIN_FXML = "views/LoginViews/TALogin.fxml";

    // Main
    public final String ADMIN_MAIN_FXML = "views/UsersMainViews/AdminMain.fxml";
    public final String TA_MAIN_FXML = "views/UsersMainViews/TAMain.fxml";

    // Lectures
    public final String ADD_LECTURE_FXML = "views/TAViews/LecturesViews/AddLecture.fxml";
    public final String EDIT_LECTURE_FXML = "views/TAViews/LecturesViews/EditLecture.fxml";
    public final String DELETE_LECTURE_FXML = "views/TAViews/LecturesViews/DeleteLecture.fxml";
    public final String SHOW_LECTURES_FXML = "views/TAViews/LecturesViews/ShowCourseLectures.fxml";
    public final String SHOW_ATTENDANCE_FXML = "views/TAViews/LecturesViews/ShowAttendance.fxml";
    public final String SHOW_LECTURE_ATTENDANCE_BY_TITLE_FXML = "views/TAViews/LecturesViews/ShowLectureAttendanceByTitle.fxml";


    // Students
    public final String ADD_STUDENT_FXML = "views/TAViews/StudentsViews/AddStudent.fxml";
    public final String EDIT_STUDENT_FXML = "views/TAViews/StudentsViews/EditStudent.fxml";
    public final String DELETE_STUDENT_FXML = "views/TAViews/StudentsViews/DeleteStudent.fxml";
    public final String SHOW_STUDENT_ATTENDANCE_FXML= "views/TAViews/StudentsViews/ShowStudentAttendance.fxml";
    public final String JOIN_COURSE_FXML= "views/TAViews/StudentsViews/JoinCourse.fxml";

    // Attendance
    public final String ADD_ATTENDANCE_FXML = "views/TAViews/AttendanceViews/AddAttendance.fxml";
    public final String DELETE_ATTENDANCE_FXML = "views/TAViews/AttendanceViews/DeleteAttendance.fxml";


    // Accounts
    public final String CREATE_ACCOUNT_FXML = "views/AdminViews/AccountsViews/CreateAccount.fxml";
    public final String EDIT_ACCOUNT_FXML = "views/AdminViews/AccountsViews/EditAccount.fxml";
    public final String DELETE_ACCOUNT_FXML = "views/AdminViews/AccountsViews/DeleteAccount.fxml";
    public final String SHOW_ACCOUNTS_FXML = "views/AdminViews/AccountsViews/ShowAccounts.fxml";


    // Courses
    public final String CREATE_COURSE_FXML = "views/AdminViews/CoursesViews/CreateCourse.fxml";
    public final String EDIT_COURSE_FXML = "views/AdminViews/CoursesViews/EditCourse.fxml";
    public final String DELETE_COURSE_FXML = "views/AdminViews/CoursesViews/DeleteCourse.fxml";
    public final String SHOW_COURSES_FXML = "views/AdminViews/CoursesViews/ShowCourses.fxml";
    public final String SHOW_STUDENTS_FXML = "views/AdminViews/CoursesViews/ShowStudents.fxml";
    public final String SHOW_ABSENT_STUDENT_FXML = "views/AdminViews/CoursesViews/ShowAbsentStudents.fxml";



    public void navigateTo(Parent rootPane, String path) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(path)));
            rootPane.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
