package com.codefrombasics.oops.inheritance;
class Birds{
   protected String name;
    public Birds(String name){
        this.name=name;
        System.out.println("Birds class constructor Invoked");
    }

}
class Pigeon extends Birds{
    int age;

    public Pigeon(String name,int age) {
        super(name);
        this.age = age;
        System.out.println("Pigeon class constructor Invoked");
    }
    public void display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}
public class KnowledgeTest {
    public static void main(String[] args) {
        Pigeon pigeon=new Pigeon("Bunny",3);
        pigeon.display();

    }
}
