module com.example.studentattendacneproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires easyexcel;



    opens com.example.studentattendacneproject to javafx.fxml;
    exports com.example.studentattendacneproject;
    exports com.example.studentattendacneproject.Models;
    opens com.example.studentattendacneproject.Models to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers;
    opens com.example.studentattendacneproject.Controllers to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers;
    opens com.example.studentattendacneproject.Controllers.TAControllers.LecturesControllers to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers.LoginControllers;
    opens com.example.studentattendacneproject.Controllers.LoginControllers to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers;
    opens com.example.studentattendacneproject.Controllers.TAControllers.StudentsControllers to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers.TAControllers.AttendanceControllers;
    opens com.example.studentattendacneproject.Controllers.TAControllers.AttendanceControllers to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers.AdminControllers.AccountsControllers;
    opens com.example.studentattendacneproject.Controllers.AdminControllers.AccountsControllers to javafx.fxml;
    exports com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers;
    opens com.example.studentattendacneproject.Controllers.AdminControllers.CoursesControllers to javafx.fxml;
}