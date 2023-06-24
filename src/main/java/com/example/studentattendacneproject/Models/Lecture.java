package com.example.studentattendacneproject.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Lecture implements Serializable {
    private static final long serialVersionUID = 1L;    // To solve an error (I forgot what it was)
    private String lectureId;
    private String title;
    private String room;
    private ArrayList<Student> attendance = new ArrayList<>();
    private int attendanceNumber;

    public Lecture(String lectureId, String title, String room) {
        this.lectureId = lectureId;
        this.title = title;
        this.room = room;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public ArrayList<Student> getAttendance() {
        return attendance;
    }

    // Add attendant student by name, id, or phone number
    public void addAttendantStudent(String s) {
        attendance.add(DataModel.getStudentReference(s));
        attendanceNumber++;
        System.out.println(DataModel.getStudentReference(s).getId() + " attended the lecture" + lectureId);
    }

    // Delete attendant student by name, id, or phone number
    public void deleteAttendantStudent(String s) {
        attendance.remove(DataModel.getStudentReference(s));
        attendanceNumber--;
    }

    // View lecture records
    public String viewLectureRecords() {

        String report = "Attended Students in lecture" + lectureId + ":\n";

        for (int i = 0; i < attendanceNumber; i++) {
            report += (attendance.get(i)).getId();
            if (i != attendanceNumber - 1)
                report += "\n";
        }

        return report;

    }


    @Override
    public String toString() {
        return String.format("Id: %-10s\tTitle: %-15s\tRoom: %-15s\tAttendanceNumber: %-15s",
                lectureId, title, room, attendanceNumber);

    }
}
