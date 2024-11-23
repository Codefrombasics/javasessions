package com.codefrombasics.oops.interfaces;
interface A1{
    int a=10;
    void show();
}
interface B1{
    int a=10;
    void show();
}
public class MultipleInheritance implements A1,B1 {
    public static void main(String[] args) {
        A1 a1=new MultipleInheritance();
        System.out.println(A1.a);
    }

    @Override
    public void show() {
        System.out.println("show()");
    }
}
