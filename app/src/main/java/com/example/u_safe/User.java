package com.example.u_safe;

import android.text.TextUtils;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private static ArrayList<User> userList = new ArrayList<>();

    private int userId;
    private String email;
    private String userName;
    private String password;
    private String vacStatus;
    private String covidRisk;
    private Date timeStampCreated;
    private Date timeStampDeleted;

    FirebaseDatabase database;
    DatabaseReference reference;

    public User(int userId, String email, String userName, String password, String vacStatus, String covidRisk) {
        this.userId = userId;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.vacStatus = vacStatus;
        this.covidRisk = covidRisk;
    }

    public Date getTimeStampCreated() {
        return timeStampCreated;
    }

    public void setTimeStampCreated(Date timeStampCreated) {
        this.timeStampCreated = timeStampCreated;
    }

    public Date getTimeStampDeleted() {
        return timeStampDeleted;
    }

    public void setTimeStampDeleted(Date timeStampDeleted) {
        this.timeStampDeleted = timeStampDeleted;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVacStatus() {
        return vacStatus;
    }

    public void setVacStatus(String vacStatus) {
        this.vacStatus = vacStatus;
    }

    public String getCovidRisk() {
        return covidRisk;
    }

    public void setCovidRisk(String covidRisk) {
        this.covidRisk = covidRisk;
    }

    //Create account

    //Load account(s)
    public static ArrayList<User> getUserList() {
        return userList;
    }

    //Login Account

    //Update account

    //Delete Account
}

