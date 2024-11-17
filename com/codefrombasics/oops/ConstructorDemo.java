package com.codefrombasics.oops;

public class ConstructorDemo {
    public static void main(String[] args) {
        User user=new User();//constructor will be called
        System.out.println(user);

        User user2=new User(102,"Lavanya","Lavanya@gmail.com");
        System.out.println("User2 "+user2);
        user2.setUserName("Lavanyahari");
        System.out.println("User2 with updated Name "+user2);
    }
}
