package com.codefrombasics.oops.interfaces;

public class Interfacedemo {
    public static void main(String[] args) {
        CarImpl car=new CarImpl();
        car.start();
        car.run(60);
        car.stop();
    }
}

