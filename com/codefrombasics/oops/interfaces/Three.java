package com.codefrombasics.oops.interfaces;

public class Three implements inter1{
    @Override
    public void display() {
        show();//calls the show() from inter1

        System.out.println("Three Class");
    }
}
