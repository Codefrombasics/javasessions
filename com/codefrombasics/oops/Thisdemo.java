package com.codefrombasics.oops;

public class Thisdemo {
    public static void main(String[] args) {
        Employee employee1=new Employee();
//        System.out.println(employee1);
        Employee employee2=new Employee(1009,"XYZ","India");
//        System.out.println(employee2);
        employee1.getData();
        employee2.getData();

    }
}
