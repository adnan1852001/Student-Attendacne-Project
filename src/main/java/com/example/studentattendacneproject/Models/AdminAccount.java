package com.example.studentattendacneproject.Models;

import java.io.Serializable;

public class AdminAccount extends Account implements Serializable {
    public AdminAccount(String userName, String password) {
            super(userName, password);
        }
}


