package com.example.studentattendacneproject.Models;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String fourthName;
    private String phoneNum;
    private String address;

    public Person(String firstName, String secondName, String thirdName, String fourthName, String phoneNum, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.fourthName = fourthName;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getFourthName() {
        return fourthName;
    }

    public void setFourthName(String fourthName) {
        this.fourthName = fourthName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + ", " + secondName + ", " + thirdName + ", " + fourthName + ", " + phoneNum + ", " + address;
    }
}
