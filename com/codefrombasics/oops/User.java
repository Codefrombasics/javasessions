package com.codefrombasics.oops;

public class User {
    private int userId;
    private String userName;
    private String userEmail;
    public
    User(){//empty construction
        userId=101;
        userName="Hariharan";
        userEmail="hariharan123@gmail.com";

    }

    //parameterized constructor
    public User(int userId, String userName, String userEmail) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
