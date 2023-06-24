package com.example.studentattendacneproject.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;    // To solve an error (I forgot what it was)
    private String Id;
    private String topic;
    private String textBook;
    private String instructor;
    private int lecturesNumber;
    private ArrayList<Lecture> lecturesList = new ArrayList<>();
    private ArrayList<Student> studentsList = new ArrayList<>();

    public Course(String Id, String topic, String textBook, String instructor, int lecturesNumber) {
        this.Id = Id;
        this.topic = topic;
        this.textBook = textBook;
        this.instructor = instructor;
        this.lecturesNumber = lecturesNumber;
    }

    public Course(String id, String topic, String textBook, String instructor, int lecturesNumber, ArrayList<Lecture> lecturesList, ArrayList<Student> studentsList) {
        Id = id;
        this.topic = topic;
        this.textBook = textBook;
        this.instructor = instructor;
        this.lecturesNumber = lecturesNumber;
        this.lecturesList = lecturesList;
        this.studentsList = studentsList;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTextBook() {
        return textBook;
    }

    public void setTextBook(String textBook) {
        this.textBook = textBook;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getLecturesNumber() {
        return lecturesNumber;
    }

    public void setLecturesNumber(int lecturesNumber) {
        this.lecturesNumber = lecturesNumber;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ArrayList<Student> getStudentList() {
        return studentsList;
    }

    public ArrayList<Lecture> getLecturesList() {
        return lecturesList;
    }

    // Add student to the course
    public void addStudent(Student student) throws RuntimeException {

        if ((student != null) && !(studentsList.contains(student))) {
            studentsList.add(student);
            System.out.println(student.getId() + " is now registered.");
        } else if (studentsList.contains(student))
            throw new RuntimeException(student.getId() + " is already registered.");
        else
            throw new RuntimeException("Student is not found.");

    }

    // Used only after the course ends (the attendance of all lectures should be taken)
    public ArrayList<Student> getAbsentStudents() throws RuntimeException {

        ArrayList<Student> absentStudnets = new ArrayList<>();

        for (Student student: studentsList)
            if (((student.getLecturesRecord().size()) <= (0.25 * (double) lecturesNumber)))
                absentStudnets.add(student);

        return absentStudnets;
    }


    // Add lecture to the course
    public void addLecture(Lecture lecture) throws RuntimeException {

        if (lecturesList.size() <= lecturesNumber) {
            if (lecture != null)
                lecturesList.add(lecture);
            else
                throw new RuntimeException("Lecture is not found");
        }

    }

    // Delete lecture from the course
    public Lecture deleteLectureById(String id) {

        for (Lecture lecture: lecturesList)
            if (Objects.equals(lecture.getLectureId(), id)) {
                lecturesList.remove(lecture);
                return lecture;
            }

        return null;
    }

    // Edit lecture in specific course
    public Lecture getLectureById(String id){
        for (Lecture lecture: lecturesList)
            if (Objects.equals(lecture.getLectureId(), id))
                return lecture;

        return null;
    }

    public Lecture getLectureByTitle(String title){
        for (Lecture lecture: lecturesList)
            if (Objects.equals(lecture.getTitle(), title))
                return lecture;

        return null;
    }

    @Override
    public String toString() {

        return String.format("Id: %-10s\tTopic: %-10s\tBook: %-10s\tInstructor: %-10s\tLectures Num: %-5s", Id, topic, textBook, instructor, lecturesNumber);
    }
}
