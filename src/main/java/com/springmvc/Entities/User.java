package com.springmvc.Entities;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String UserName;
    public String UserEmail;
    public String UserPassword;

    public User() {}

    public User(String userName, String userEmail, String userPassword) {
        UserName = userName;
        UserEmail = userEmail;
        UserPassword = userPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                '}';
    }
}
