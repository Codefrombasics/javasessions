package com.codefrombasics.oops.interfaces;

public interface inter1 {
    public void display();
    private void privateMethod(){
        System.out.println("I am from privateMethod()");
    }
    default void show(){
        privateMethod();
        System.out.println("default method show");
    }
}
