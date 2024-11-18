package com.codefrombasics.oops.inheritance;
class A{
//    public A(){
//        System.out.println("A()");
//    }
    public A(int a){
        System.out.println(a);
    }
}
class B extends A{//B is a derived class, A is Base class
//    public B(){
//        System.out.println("B()");
//    }
    public B(int b){
        super(10);
        System.out.println(b);
    }
}
public class Constructorin_Inheritance {
    public static void main(String[] args) {
//        B b1=new B();//A() B()
        B b=new B(10);//A() B(10)
    }
}
