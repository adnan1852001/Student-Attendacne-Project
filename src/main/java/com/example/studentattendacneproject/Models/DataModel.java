package com.example.studentattendacneproject.Models;

import javafx.scene.control.Alert;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class DataModel {

    // Admin
    private static ArrayList<Account> accounts = null;
    private static ArrayList<Course> courses = null;

    // TA
    private static ArrayList<Student> students = null;


    public DataModel() {
        initialize();
    }

    public static void initialize() {

        AdminAccount amdin = new AdminAccount("abc", "123");

        if (courses == null) {

            File file = new File("courses.bin");

            if (file.exists()){
                try (
                    FileInputStream fileIn = new FileInputStream(file);
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                ) {
                    courses = (ArrayList<Course>) in.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                courses = new ArrayList<>();
                // add Test data when you run the program for the first time
                courses.add(new Course("1", "Java Programming", "Y Liang", "instructorA", 24));
                courses.add(new Course("2", "Logic Design", "Morris", "instructorB", 24));
            }
        }


        if (students == null) {

            File file = new File("students.bin");

            if (file.exists()) {

                try (
                     FileInputStream fileIn = new FileInputStream(file);
                     ObjectInputStream in = new ObjectInputStream(fileIn);
                    ) {
                        students = (ArrayList<Student>) in.readObject();
                } catch (Exception e) {
                        e.printStackTrace();
                    }

            } else {
                students = new ArrayList<>();
                // add Test data when you run the program for the first time
                students.add(new Student("120210001", "Ahmed", "A", "M", "L", "0599001122", "Gaza"));
                students.add(new Student("120210002", "Mohammed", "S", "O", "M", "0599333445", "Rafah"));
            }
        }


        if (accounts == null) {

            File file = new File("accounts.bin");

            if (file.exists()) {
                try (
                     FileInputStream fileIn = new FileInputStream(file);
                     ObjectInputStream in = new ObjectInputStream(fileIn);
                ) {
                    accounts = (ArrayList<Account>) in.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                accounts = new ArrayList<>();
                // add Test data when you run the program for the first time
                accounts.add(new Account("ABC", "123"));
            }
        }

    }

    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }


    // Admin -> Accounts -----------------------------------------------------------
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account deleteAccountByName(String username) {
        for (Account account : accounts) {
            if (Objects.equals(account.getUserName(), username)) {
                accounts.remove(account);
                return account;
            }
        }
        return null;
    }

    public static Account getAccountByUsername(String username){
        for (Account account: accounts)
            if (Objects.equals(account.getUserName(), username))
                return account;

        return null;
    }


    public boolean checkAccount(String username, String password) {
        for (Account account: accounts)
            if ((Objects.equals(account.getUserName(), username) && ((Objects.equals(account.getPassword(), password)))))
                return true;
        return false;
    }


    public void save_Accounts() {
        try {
            FileOutputStream fileOut = new FileOutputStream("accounts.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(accounts);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in accounts.bin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Admin -> Courses -----------------------------------------------------------

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course deleteCourseById(String id) {
        for (Course course : courses) {
            if (Objects.equals(course.getId(), id)) {
                courses.remove(course);
                return course;
            }
        }
        return null;
    }

    public static Course getCourseById(String id){
        for (Course course: courses)
            if (Objects.equals(course.getId(), id))
                return course;

        return null;
    }

    public void save_Courses() {

        try {
            FileOutputStream fileOut = new FileOutputStream("courses.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(courses);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in courses.bin");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // TA -> Students -----------------------------------------------------------
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student deleteStudentById(String id) {
        for (Student student : students) {
            if (Objects.equals(student.getId(), id)) {
                accounts.remove(student);
                return student;
            }
        }
        return null;
    }

    public static Student getStudentReference(String s) {

        ArrayList<Student> studentsList = getStudents();

        for (Student student: studentsList) {
            if (Objects.equals(student.getId(), s))
                return student;
            if (Objects.equals(student.getPhoneNum(), s))
                return student;
            if (Objects.equals((student.getFirstName() + " " + student.getSecondName() + " " + student.getThirdName() + " " + student.getFourthName()), s))
                return student;
        }

        return null;

    }

    public void save_Students() {
        try {
            FileOutputStream fileOut = new FileOutputStream("students.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(students);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in students.bin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void exportAbsentToExcel(Course course) {

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Data");

            int rowNum = 0;
            for (Student student : course.getAbsentStudents()) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(student.getId());
            }

            try (FileOutputStream outputStream = new FileOutputStream("course" + course.getId() + "_absent.xlsx")) {
                workbook.write(outputStream);
            }

            System.out.println("Data exported successfully to course" + course.getId() + "_absent.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The process has been done successfully");
        alert.setTitle("Done");
        alert.showAndWait();
    }


//
//    public ArrayList<Student> importAttendanceFromExcel(String path) throws Exception {
//    }


}