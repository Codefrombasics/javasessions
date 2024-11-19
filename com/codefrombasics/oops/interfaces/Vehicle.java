package com.codefrombasics.oops.interfaces;

public interface Vehicle {
    void start();
    void stop();
    void run(int speed);
    int num=10;
}

class CarImpl implements Vehicle{

    @Override
    public void start() {
        System.out.println("car is starting");

    }

    @Override
    public void stop() {
        System.out.println("car is stopping");
    }

    @Override
    public void run(int speed) {
        System.out.println("car is running.... "+"at speed "+speed);
    }
}


