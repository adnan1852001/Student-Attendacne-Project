package com.example.studentattendacneproject.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends Person implements Serializable {
    private static final long serialVersionUID = 1L;    // To solve an error (I forgot what it was)
    private String id;
    private int gender; // 1: male, and 2: female
    private ArrayList<Lecture> lecturesRecord = new ArrayList<>();

    public Student(String id, String fName, String sName, String thName, String foName, String phoneNumber, String address) {
        super(fName, sName, thName, foName, phoneNumber, address);
        this.id = id;
        this.gender = Integer.parseInt(id.substring(0, 1));
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }



    public ArrayList<Lecture> getLecturesRecord() {
        return lecturesRecord;
    }

    public void updateLecturesRecord(Lecture lecture) {
        lecturesRecord.add(lecture);
    }

    // Cancel lecture attendance
    public void cancelLectureAttendance(Lecture lecture) {
        lecturesRecord.remove(lecture);
    }

    @Override
    public String toString() {
        return id + ", " + super.toString();
    }


    //    public String viewCourseRecord(Course course) {
//
//        String report = "";
//
//        for (int i = 0; i < course.getLecturesNumber(); i++) {
//            if (lecturesRecord.get(i))
//                report += "lecture" + i + ": attended" + "\n";
//            else
//                report += "lecture" + i + ": not attended" + "\n";
//        }
//
//        return report;
//    }


}
